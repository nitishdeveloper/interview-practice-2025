package DesignPatternPractice.Command.Queue;

public class EmailTask implements TaskCommand{
    private final EmailService emailService;
    private final String taskId;
    private final String recipient;
    private final String subject;
    private final String body;

    public EmailTask(EmailService emailService, String recipient, String subject, String body) {
        this.emailService = emailService;
        this.taskId = "EMAIL-" + System.currentTimeMillis();
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public void execute() {
        emailService.sendEmail(recipient, subject, body);
    }

    @Override
    public void undo() {
        emailService.recallEmail(recipient, subject);
    }

    @Override
    public String toString() {
        return "EmailTask[" + taskId + "] to " + recipient;
    }
}
