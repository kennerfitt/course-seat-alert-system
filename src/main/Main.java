public class Main {

    public static void main(String[] args) {

        // Factory Method creates the strategies
        NotificationCreator emailCreator =
                new EmailNotificationCreator();

        NotificationCreator textCreator =
                new TextNotificationCreator();

        NotificationStrategy emailStrategy =
                emailCreator.createNotification();

        NotificationStrategy textStrategy =
                textCreator.createNotification();

        // Decorator wraps strategies with logging
        NotificationStrategy loggedEmail =
                new LoggingNotification(emailStrategy);

        NotificationStrategy loggedText =
                new LoggingNotification(textStrategy);

        Student student1 =
                new Student("student1@depaul.edu", loggedEmail);

        Student student2 =
                new Student("student2@depaul.edu", loggedText);

        Course course = new Course("SE 350", 3);
        course.addStudent(student1);
        course.addStudent(student2);

        // Singleton registry tracks all courses
        CourseRegistry registry = CourseRegistry.getInstance();
        registry.addCourse(course);

        registry.printAllCourses();

        // Command pattern executes seat changes
        SeatChangeCommand command1 =
                new SeatChangeCommand(course, 2);

        SeatChangeCommand command2 =
                new SeatChangeCommand(course, 0);

        System.out.println("\nSomeone enrolled...");
        command1.execute();

        System.out.println("\nMore students enrolled...");
        command2.execute();

        registry.printAllCourses();
    }
}