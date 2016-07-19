package utils;



import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class ReadingEmail {

   public static void check(String host, String storeType, String user,
      String password) 
   {
      try {

      //create properties field
      Properties properties = new Properties();

      properties.put("imap.gmail.com", host);
      properties.put("imap.gmail.com", "993");
      properties.put("gmail.com.starttls.enable", "true");
      Session emailSession = Session.getDefaultInstance(properties);
  
      //create the GMAIL store object and connect with the pop server
      Store store = emailSession.getStore("gmail");

      store.connect(host, user, password);

      //create the folder object and open it
      Folder emailFolder = store.getFolder("Inbox");
      emailFolder.open(Folder.READ_ONLY);

      // retrieve the messages from the folder in an array and print it
      Message[] messages = emailFolder.getMessages();
      System.out.println("messages.length---" + messages.length);

      for (int i = 0, n = messages.length; i < n; i++) {
         Message message = messages[i];
         System.out.println("---------------------------------");
         System.out.println("Email Number " + (i + 1));
         System.out.println("Subject: " + message.getSubject());
         System.out.println("From: " + message.getFrom()[0]);
         System.out.println("Text: " + message.getContent().toString());

      }

      //close the store and folder objects
      emailFolder.close(false);
      store.close();

      
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {

      String host = "pop.gmail.com";
      String mailStoreType = "pop3";
      String username = "andrada.maniac@gmail.com";
      String password = "musiccolor";// change accordingly

      check(host, mailStoreType, username, password);

   }

}