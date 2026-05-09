public class Student {

    private String email;

    private NotificationStrategy notificationStrategy;

    public Student(String email,
                   NotificationStrategy notificationStrategy) {

        this.email = email;

        this.notificationStrategy = notificationStrategy;
    }

    public void update(String message) {

        notificationStrategy.sendNotification(email, message);
    }
}