package utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import com.sun.mail.imap.IMAPFolder;

public class MailReadAndOutput {

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

		
		
		PrintWriter writer = new PrintWriter("mailOutput.txt", "UTF-8");
		writer.println("No of Messages : " + folder.getMessageCount());
		writer.println("No of Unread Messages : " + folder.getUnreadMessageCount());
		writer.println(messages.length);

		
		printMessages(messages, writer);
	}

	public static void printMessages(Message[] messages, PrintWriter writer) throws MessagingException, IOException {
		
		String subject = null;
		for (int i = 0; i < messages.length; i++) {
			writer.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			writer.println("MESSAGE " + (i + 1) + ":");
			Message msg = messages[i];

			subject = msg.getSubject();
			writer.println("Subject: " + subject);
			writer.println("From: " + msg.getFrom()[0]);
			writer.println("To: " + msg.getAllRecipients()[0]);
			writer.println("Date: " + msg.getReceivedDate());
			writer.println("Size: " + msg.getSize());
//			writer.println(msg.getFlags());
			writer.println("Body: " + msg.getContent());
//			writer.println(msg.getContentType());
			System.out.println("Body: " + msg.getContent());
//			if (i == messages.length){

//			}
		}
		writer.close();
	}
	


}