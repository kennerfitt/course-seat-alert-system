public class EmailNotificationCreator extends NotificationCreator {

    @Override
    public NotificationStrategy createNotification() {

        return new EmailNotification();
    }
}