public class TextNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String email, String message) {

        System.out.println("\nText message sent to: " + email);
        System.out.println(message);
    }
}