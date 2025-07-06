package org.lld;

public class EmployeeReport extends ReportTemplate{
    String reportType;

    public EmployeeReport(String reportType) {
        this.reportType = reportType;
    }

    @Override
    protected void gatherData() {
        System.out.println("Gathering " + reportType + " data");
    }

    @Override
    protected void processData() {
        System.out.println("Processing "+ reportType + " data");
    }
}
