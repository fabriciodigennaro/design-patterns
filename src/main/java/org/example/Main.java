package org.example;

import org.example.factory.ConcreteReportFactory;
import org.example.factory.Report;
import org.example.factory.ReportFactory;

public class Main {
    public static void main(String[] args) {
        ReportFactory reportFactory = new ConcreteReportFactory();

        Report pdfReport = reportFactory.create("pdf");
        Report excelReport = reportFactory.create("excel");
        Report htmlReport = reportFactory.create("html");
        Report jsonReport = reportFactory.create("json");

    }
}