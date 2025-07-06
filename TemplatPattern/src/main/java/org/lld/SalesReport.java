package org.lld;

public class SalesReport extends ReportTemplate{
    String reportType;

    public SalesReport(String reportType) {
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
