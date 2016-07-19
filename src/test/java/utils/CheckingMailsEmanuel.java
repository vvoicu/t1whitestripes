package utils;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

public class CheckingMailsEmanuel {

	public void check(String host, String storeType, String user, String password) {
		try {

			// create properties field
			Properties properties = new Properties();

			properties.put("imaps.gmail.com", host);
			properties.put("imaps.gmail.com", "993");
			properties.put("mail.store.protocol", "imaps");
			Session emailSession = Session.getDefaultInstance(properties);

			// create the GMAIL store object and connect with the pop server
			Store store = emailSession.getStore("imaps");
			store.connect(host, user, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("Inbox");
			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

			//for(int i = 0; i < messages.length; i++){
					for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
		

				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				//System.out.println("Text: " + message.getContent());
				System.out.println("Text: " + getTextFromMessage(messages[i]));

			}

			// close the store and folder objects
			emailFolder.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Part where content is separated as MimeType
	public String getTextFromMessage(Message message) throws Exception {
		String result = "";
		if (message.isMimeType("text/*")) {
			result = message.getContent().toString();
		} else if (message.isMimeType("multipart/*")) {
			MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
			result = getTextFromMimeMultipart(mimeMultipart);
		}
		return result;
	}

	// Part where content is read as MimeType.
	private String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws Exception {
		String result = "";
		int count = mimeMultipart.getCount();
		for (int i = 0; i < count; i++) {
			BodyPart bodyPart = mimeMultipart.getBodyPart(i);
			if (bodyPart.isMimeType("text/plain")) {
				result = result + "\n" + bodyPart.getContent();
				break; // without break same text appears twice in my tests.
			} else if (bodyPart.isMimeType("text/html")) {
				String html = (String) bodyPart.getContent();
				result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
			} else if (bodyPart.getContent() instanceof MimeMultipart) {
				result = result + getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent());
			}
		}
		return result;
	}

	public static void main(String[] args) {

		// mail server connection parameters
		
		CheckingMailsEmanuel rm = new CheckingMailsEmanuel();
		
		String host = "mail.evozon.com";
		String mailStoreType = "imaps";
		String username = "petru.radac@evozon.com";
		String password = "EmanuelRadac93!";

		rm.check(host, mailStoreType, username, password);

	}

}