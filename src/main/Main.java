public class Main {
    public static void main(String[] args) {
        Student student = new Student("student@depaul.edu");

        Course course = new Course("SE 350", 3);

        System.out.println(course.getCourseCode() + " seats: "
                + course.getAvailableSeats() + " (" + course.getStatus() + ")");

        System.out.println("\nSomeone enrolled...");
        course.setAvailableSeats(2);

        student.sendEmail(
                course.getCourseCode() + " now has "
                        + course.getAvailableSeats() + " available seats."
        );

        System.out.println("\nMore students enrolled...");
        course.setAvailableSeats(0);

        student.sendEmail(
                course.getCourseCode() + " is now " + course.getStatus() + "."
        );
    }
}