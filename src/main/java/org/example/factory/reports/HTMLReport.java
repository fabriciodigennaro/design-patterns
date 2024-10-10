package org.example.factory.reports;

import org.example.factory.Report;

public class HTMLReport implements Report {
    @Override
    public void generate() {
        System.out.println("This is a HTML report!");
    }
}
