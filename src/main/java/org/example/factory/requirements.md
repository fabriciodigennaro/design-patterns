# Exercise: Report Generation System

## Requirements:
Common interface for reports:

Create an interface Report that has a method generate().
All types of reports (PDF, Excel, HTML) will implement this interface.

## Types of reports:
Implement three classes that represent different types of reports: PDFReport, ExcelReport, and HTMLReport.
Each class must implement the generate() method from the Report interface, simulating the generation of the report.

## Factory for report creation:
Create a class ReportFactory that has a method responsible for creating the correct report based on 
a parameter (such as "pdf", "excel", or "html").
The factory should return an instance of Report according to the requested type.

## Report generation simulation:
In each report implementation, the generate() method should simply print a message simulating the creation of
the report (for example, "Generating PDF Report").

## User input:
Implement a class that asks the user (or another method) for the type of report they want to generate,
and then use the ReportFactory to obtain and generate the appropriate report.

## Extensibility:
Ensure that it is easy to add new types of reports in the future (e.g., a report in JSON format).