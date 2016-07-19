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

public class CheckingMailsEmanuel {

	public static void check(String host, String storeType, String user, String password) {
		try {

			// create properties field
			Properties properties = new Properties();

			properties.put("imaps.gmail.com", host);
			properties.put("imaps.gmail.com", "993");
			properties.put("mail.store.protocol", "imaps");
			Session emailSession = Session.getDefaultInstance(properties);

			//create the GMAIL store object and connect with the pop server
			Store store = emailSession.getStore("imaps");
			store.connect(host, user, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("Inbox");
			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

			 Message msg =
			 emailFolder.getMessage(emailFolder.getMessageCount());
//			 Multipart mp = (Multipart) msg.getContent();
//			 BodyPart bp = mp.getBodyPart(0);

			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				Multipart mp = (Multipart) msg.getContent();
				 BodyPart bp = mp.getBodyPart(0);

				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Text: " + bp.getContent());

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

	public static void main(String[] args) {

		// mail server connection parameters

		String host = "mail.evozon.com";
		String mailStoreType = "imaps";
		String username = "petru.radac@evozon.com";
		String password = "EmanuelRadac93!";

		check(host, mailStoreType, username, password);

	}

}