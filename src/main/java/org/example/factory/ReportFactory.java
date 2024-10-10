package org.example.factory;

public abstract class ReportFactory {
    public Report create(String reportType) {
        Report report = createReport(reportType);
        report.generate();
        return report;
    }

    protected abstract Report createReport(String reportType);
}
