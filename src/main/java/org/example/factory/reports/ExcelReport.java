package org.example.factory.reports;

import org.example.factory.Report;

public class ExcelReport implements Report {
    @Override
    public void generate() {
        System.out.println("This is a Excel report!");
    }
}
