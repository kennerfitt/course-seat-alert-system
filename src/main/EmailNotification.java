public class EmailNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String email, String message) {

        System.out.println("\nEmail sent to: " + email);
        System.out.println(message);
    }
}