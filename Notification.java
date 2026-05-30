interface Alerts {
    void sendAlert(String text);
}

class SMSAlert implements Alerts {
    public void sendAlert(String text) {
        System.out.println("SMS Alert Sent: " + text);
    }
}

class MailAlert implements Alerts {
    public void sendAlert(String text) {
        System.out.println("Mail Alert Sent: " + text);
    }
}

class SocialMediaAlert implements Alerts {
    public void sendAlert(String text) {
        System.out.println("New Social Media Update: " + text);
    }
}

public class Notification{
    public static void main(String[] args) {

        Alerts a1 = new SMSAlert();
        Alerts a2 = new MailAlert();
        Alerts a3 = new SocialMediaAlert();

        a1.sendAlert("OTP received successfully!");
        a2.sendAlert("Your account statement is ready.");
        a3.sendAlert("You got a new follower!");
    }
}
