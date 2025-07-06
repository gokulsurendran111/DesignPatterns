package org.lld;

public abstract class ReportTemplate {

    public void generateReport() {
        gatherData();
        processData();
        formatData();
        reportData();
    }

    protected abstract void gatherData();

    protected abstract void processData();

    protected void formatData() {
        System.out.println("Formatting the data...");
    }
    protected void reportData() {
        System.out.println("Reporting the data..." );
    }
}
