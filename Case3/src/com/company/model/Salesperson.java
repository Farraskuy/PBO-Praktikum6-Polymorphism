package com.company.model;

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the sales person object with
    //  the given data.
    //-----------------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //-----------------------------------------------------------------
    //  Returns the sales person as a string.
    //-----------------------------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //-----------------------------------------------------------------
    //  Returns true if the sales people have
    //  the same name.
    //-----------------------------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    //-----------------------------------------------------------------
    //  Order is based on total sales with the name
    //  (last, then first) breaking a tie.
    //-----------------------------------------------------------------
    public int compareTo(Object other) {
        int result;
        // This method is intentionally left incomplete as per the PDF.

        if  (this.totalSales > ((Salesperson) other).totalSales) return 1;
        if (this.totalSales < ((Salesperson) other).totalSales) return -1;

        return 0; // Returning a default value to allow compilation
    }

    //-----------------------------------------------------------------
    //  First name accessor.
    //-----------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    //-----------------------------------------------------------------
    //  Last name accessor.
    //-----------------------------------------------------------------
    public String getLastName() {
        return lastName;
    }

    //-----------------------------------------------------------------
    //  Total sales accessor.
    //-----------------------------------------------------------------
    public int getSales() {
        return totalSales;
    }
}