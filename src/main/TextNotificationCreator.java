public class TextNotificationCreator extends NotificationCreator {

    @Override
    public NotificationStrategy createNotification() {

        return new TextNotification();
    }
}