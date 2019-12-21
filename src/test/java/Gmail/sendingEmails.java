package Gmail;

import org.apache.commons.mail.SimpleEmail;
class SendEmails {
    /*
         first Step:
             go to  :

                      Make sure that your google account allows third part app
      */
    public static void main(String[] args) {
        String userName = "@gmail.com",
                passWord = "Batch12BestBatch",
                Receiver = "Cybertek.Batch@gmail.com",
                MSG ="Hello Batch 12, How are you all doing today",
                Subject ="Batch12";
        sendEmails( userName, passWord, Receiver, MSG , Subject);
        System.out.println("Send successfully");
    }
    public static void sendEmails(String username, String password, String Receiver, String MSG, String Subject){
        SimpleEmail   email;
        email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);
        email.setSubject(Subject);
        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.addTo(Receiver);
            email.send();
            Thread.sleep(3000);
        } catch (Exception e) {   }
    }
}
