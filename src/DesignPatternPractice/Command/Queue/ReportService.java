package DesignPatternPractice.Command.Queue;

public class ReportService {
    public String generateReport(String reportType) {
        System.out.println("Generating " + reportType + " report...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        return reportType + "_report_" + System.currentTimeMillis() + ".pdf";
    }

    public void deleteReport(String reportPath) {
        System.out.println("Deleting report: " + reportPath);
    }
}
