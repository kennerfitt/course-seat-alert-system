public class LoggingNotification implements NotificationStrategy {

    private NotificationStrategy wrapped;

    public LoggingNotification(NotificationStrategy wrapped) {

        this.wrapped = wrapped;
    }

    @Override
    public void sendNotification(String email, String message) {

        System.out.println("[LOG] Sending notification to: " + email);

        wrapped.sendNotification(email, message);

        System.out.println("[LOG] Notification sent.");
    }
}