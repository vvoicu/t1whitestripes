package utils;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import com.sun.mail.imap.IMAPFolder;

public class MailMarius {

	public static String mailUser = "marius.testing.activity@gmail.com";
	public static String mailPassword = "01048573";

	public static void main(String[] args) throws MessagingException, IOException {
		IMAPFolder folder = null;
		Store store = null;

		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");

		Session session = Session.getDefaultInstance(props, null);

		store = session.getStore("imaps");
		store.connect("imap.googlemail.com", mailUser, mailPassword);

		folder = (IMAPFolder) store.getFolder("inbox");

		if (!folder.isOpen())
			folder.open(Folder.READ_WRITE);

		Message[] messages = folder.getMessages();
		System.out.println("No of Messages : " + folder.getMessageCount());
		System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
		System.out.println(messages.length);

		printMessages(messages);
	}

	public static void printMessages(Message[] messages) throws MessagingException, IOException {

		String subject = null;
		for (int i = 0; i < messages.length; i++) {

			System.out.println("*****************************************************************************");
			System.out.println("MESSAGE " + (i + 1) + ":");
			Message msg = messages[i];

			subject = msg.getSubject();

			System.out.println("Subject: " + subject);
			System.out.println("From: " + msg.getFrom()[0]);
			System.out.println("To: " + msg.getAllRecipients()[0]);
			System.out.println("Date: " + msg.getReceivedDate());
			System.out.println("Size: " + msg.getSize());
			System.out.println(msg.getFlags());
			System.out.println("Body: \n" + msg.getContent());
			System.out.println(msg.getContentType());

		}
	}

}