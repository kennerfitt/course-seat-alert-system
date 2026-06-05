public class SeatChangeCommand {

    private Course course;

    private int newSeats;

    public SeatChangeCommand(Course course, int newSeats) {

        this.course = course;

        this.newSeats = newSeats;
    }

    public void execute() {

        course.setAvailableSeats(newSeats);
    }
}