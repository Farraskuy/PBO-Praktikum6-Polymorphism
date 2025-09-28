package com.company.model;

public class Commission extends Hourly {
    protected double totalSales;
    protected double commissionRate;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        this.commissionRate = commissionRate;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + totalSales * commissionRate;

        totalSales = 0;

        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Total Sales: " + totalSales + "\n Commission Rate: " + commissionRate;
    }
}
