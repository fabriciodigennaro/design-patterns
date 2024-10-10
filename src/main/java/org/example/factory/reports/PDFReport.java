package org.example.factory.reports;

import org.example.factory.Report;

public class PDFReport implements Report {
    @Override
    public void generate() {
        System.out.println("This is a PDF report!");
    }
}
