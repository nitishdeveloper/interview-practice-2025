package DesignPatternPractice.Command.Queue;

public class EmailService {
    public void sendEmail(String recipient, String subject, String body) {
        System.out.printf("Sending email to %s: %s - %s%n", recipient, subject, body);
    }

    public void recallEmail(String recipient, String subject) {
        System.out.printf("Recalling email to %s: %s%n", recipient, subject);
    }
}
