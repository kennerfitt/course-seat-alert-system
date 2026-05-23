import java.util.ArrayList;
import java.util.List;

public class CourseRegistry {

    private static CourseRegistry instance;

    private List<Course> courses;

    private CourseRegistry() {
        courses = new ArrayList<>();
    }

    public static CourseRegistry getInstance() {

        if (instance == null) {
            instance = new CourseRegistry();
        }
        return instance;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(String courseCode) {

        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public void printAllCourses() {

        System.out.println("\n--- Course Registry ---");
        for (Course course : courses) {
            System.out.println(
                    course.getCourseCode()
                            + " | Seats: "
                            + course.getAvailableSeats()
                            + " | Status: "
                            + course.getStatus()
            );
        }
    }
}