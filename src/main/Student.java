public class Student {
    private String email;

    public Student(String email) {
        this.email = email;
    }

    public void sendEmail(String message) {
        System.out.println("\nEmail sent to: " + email);
        System.out.println(message);
    }
}