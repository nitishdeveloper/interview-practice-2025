package DesignPatternPractice.Command.Queue;

public class JobQueueSystem {
    public static void main(String[] args) throws InterruptedException {
        EmailService emailService = new EmailService();
        ReportService reportService = new ReportService();
        TaskScheduler_Invoker scheduler = new TaskScheduler_Invoker();
        scheduler.addTask(new EmailTask(emailService, "manager@company.com", "Urgent", "Please review the Q2 results"));
        scheduler.addTask(new ReportGenerationTask(reportService, "Quarterly"));
        scheduler.addTask(new EmailTask(emailService, "team@company.com", "Update", "New features deployed"));

        scheduler.displayQueueStatus();

        Thread.sleep(5000);

        scheduler.addTask(new ReportGenerationTask(reportService, "Monthly"));

        Thread.sleep(5000);
        scheduler.displayQueueStatus();
    }
}
