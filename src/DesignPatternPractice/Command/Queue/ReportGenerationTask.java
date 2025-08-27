package DesignPatternPractice.Command.Queue;

public class ReportGenerationTask implements TaskCommand{
    private final ReportService reportService;
    private final String taskId;
    private final String reportType;
    private String generatedReportPath;

    public ReportGenerationTask(ReportService reportService, String reportType) {
        this.reportService = reportService;
        this.taskId = "REPORT-" + System.currentTimeMillis();
        this.reportType = reportType;
    }

    @Override
    public void execute() {
        this.generatedReportPath = reportService.generateReport(reportType);
        System.out.println("Generated report: " + generatedReportPath);
    }

    @Override
    public void undo() {
        if (generatedReportPath != null) {
            reportService.deleteReport(generatedReportPath);
        }
    }
}
