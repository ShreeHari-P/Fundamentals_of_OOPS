interface Notifier {
    void sendNotification(String msg);

    default void notifyUser(String msg){
        System.out.println("Sending Notification...");
        sendNotification(msg);
    }

    static String format(String msg){
        return msg.toLowerCase();
    }
}

class EmailNotifier implements Notifier{

    @Override
    public void sendNotification(String msg){
        System.out.println("Email: " + msg);
    }

}

class SMSNotifier implements Notifier{

    @Override
    public void sendNotification(String msg){
        System.out.println("SMS: " + msg);
    }
}

public class Notifiers {

    public static void main(String[] args) {

        String formattedMsg = Notifier.format("HELLO");
        EmailNotifier email = new EmailNotifier();
        SMSNotifier sms = new SMSNotifier();

        email.notifyUser(formattedMsg);
        
        sms.notifyUser(formattedMsg);
    }
}   