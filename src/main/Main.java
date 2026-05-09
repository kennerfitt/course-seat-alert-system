public class Main {

    public static void main(String[] args) {

        // create notification strategy
        NotificationStrategy emailStrategy =
                new EmailNotification();

        // create students
        Student student1 =
                new Student(
                        "student1@depaul.edu",
                        emailStrategy
                );

        Student student2 =
                new Student(
                        "student2@depaul.edu",
                        emailStrategy
                );

        // create course
        Course se350 =
                new Course("SE 350", 3);

        // students subscribe to course
        se350.addStudent(student1);

        se350.addStudent(student2);

        System.out.println(
                "Initial seats: "
                        + se350.getAvailableSeats()
                        + " ("
                        + se350.getStatus()
                        + ")"
        );

        // simulate enrollment
        System.out.println("\nSomeone enrolled...");

        se350.setAvailableSeats(2);

        // simulate more enrollment
        System.out.println("\nMore students enrolled...");

        se350.setAvailableSeats(0);
    }
}