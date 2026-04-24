public class Course {
    private String courseCode;
    private int availableSeats;
    private String status;

    public Course(String courseCode, int availableSeats) {
        this.courseCode = courseCode;
        this.availableSeats = availableSeats;
        updateStatus();
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
        this.availableSeats = seats;
        updateStatus();
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