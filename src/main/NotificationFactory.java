public class NotificationFactory {

    public static NotificationStrategy create(String type) {

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "text":
                return new TextNotification();
            default:
                throw new IllegalArgumentException(
                        "Unknown notification type: " + type
                );
        }
    }
}