package org.example.factory;

import org.example.factory.reports.ExcelReport;
import org.example.factory.reports.HTMLReport;
import org.example.factory.reports.JsonReport;
import org.example.factory.reports.PDFReport;

public class ConcreteReportFactory extends ReportFactory{
    @Override
    protected Report createReport(String reportType) {
        return switch (reportType.toLowerCase()) {
            case "pdf" -> new PDFReport();
            case "excel" -> new ExcelReport();
            case "html" -> new HTMLReport();
            case "json" -> new JsonReport();
            default -> throw new IllegalArgumentException("Unknown report type: " + reportType);
        };
    }
}
