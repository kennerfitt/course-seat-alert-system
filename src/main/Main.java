public class Main {

    public static void main(String[] args) {

        // Factory Method creates the right strategy by name
        NotificationStrategy emailStrategy =
                NotificationFactory.create("email");

        NotificationStrategy textStrategy =
                NotificationFactory.create("text");

        Student student1 =
                new Student("student1@depaul.edu", emailStrategy);

        Student student2 =
                new Student("student2@depaul.edu", textStrategy);

        Course course = new Course("SE 350", 3);
        course.addStudent(student1);
        course.addStudent(student2);

        // Singleton registry tracks all courses
        CourseRegistry registry = CourseRegistry.getInstance();
        registry.addCourse(course);

        registry.printAllCourses();

        System.out.println("\nSomeone enrolled...");
        course.setAvailableSeats(2);

        System.out.println("\nMore students enrolled...");
        course.setAvailableSeats(0);

        registry.printAllCourses();
    }
}