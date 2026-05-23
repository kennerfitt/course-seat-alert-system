public class Main {

    public static void main(String[] args) {

        NotificationStrategy emailStrategy =
                new EmailNotification();

        NotificationStrategy textStrategy =
                new TextNotification();

        Student student1 =
                new Student(
                        "student1@depaul.edu",
                        emailStrategy
                );

        Student student2 =
                new Student(
                        "student2@depaul.edu",
                        textStrategy
                );

        Course course =
                new Course("SE 350", 3);

        course.addStudent(student1);

        course.addStudent(student2);

        System.out.println(
                course.getCourseCode()
                        + " seats: "
                        + course.getAvailableSeats()
                        + " ("
                        + course.getStatus()
                        + ")"
        );

        System.out.println("\nSomeone enrolled...");

        course.setAvailableSeats(2);

        System.out.println("\nMore students enrolled...");

        course.setAvailableSeats(0);
    }
}