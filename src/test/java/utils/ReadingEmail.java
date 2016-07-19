package utils;

import java.util.Properties;


import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class ReadingEmail {

	public static void check (String host, String storeType, String user, String password) {
		try {

			Properties properties = new Properties();

			properties.put("imaps.gmail.com", host);
			properties.put("imaps.gmail.com", "993");
			properties.put("mail.store.protocol", "imaps");
			
			Session emailSession = Session.getDefaultInstance(properties);

			Store store = emailSession.getStore("imaps");
			store.connect(host, user, password);

	
			Folder emailFolder = store.getFolder("Inbox");
			emailFolder.open(Folder.READ_WRITE);

			
			Message[] messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

//			Message msg = emailFolder.getMessage(emailFolder.getMessageCount());
			
			for (int i = messages.length-1, n = messages.length; i < n; i++) {
				Message message = messages[i];
				
				System.out.println("**************************************************");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Text: " + message.getContent());

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
		String username = "andrada.maniac@evozon.com";
		String password = "Musiccolor1!";

		check(host, mailStoreType, username, password);

	}

}