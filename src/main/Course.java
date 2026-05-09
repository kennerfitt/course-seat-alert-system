import java.util.ArrayList;

public class Course {

    private String courseCode;

    private int availableSeats;

    private String status;

    // list of students watching this course
    private ArrayList<Student> students;

    public Course(String courseCode, int availableSeats) {

        this.courseCode = courseCode;

        this.availableSeats = availableSeats;

        students = new ArrayList<>();

        updateStatus();
    }

    // add student observer
    public void addStudent(Student student) {

        students.add(student);
    }

    // notify all students
    private void notifyStudents(String message) {

        for (Student student : students) {

            student.update(message);
        }
    }

    private void updateStatus() {

        if (availableSeats > 0) {

            status = "OPEN";

        } else if (availableSeats == 0) {

            status = "FULL";

        } else {

            status = "WAITLISTED";
        }
    }

    public void setAvailableSeats(int seats) {

        int oldSeats = availableSeats;

        this.availableSeats = seats;

        updateStatus();

        // automatic notifications
        notifyStudents(
                courseCode
                        + " seats changed from "
                        + oldSeats
                        + " to "
                        + availableSeats
                        + ". Status: "
                        + status
        );
    }

    public int getAvailableSeats() {

        return availableSeats;
    }

    public String getCourseCode() {

        return courseCode;
    }

    public String getStatus() {

        return status;
    }
}