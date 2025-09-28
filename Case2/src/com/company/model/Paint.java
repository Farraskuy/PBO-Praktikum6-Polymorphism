package com.company.model;

import com.company.core.abstracts.Shape;

public class Paint {
    private double coverage; // jumlah kaki persegi per galon

    // Constructor: Mengatur objek cat.
    public Paint(double c) {
        this.coverage = c;
    }

    // Mengembalikan jumlah cat (dalam galon) yang dibutuhkan
    // untuk mengecat bentuk yang diberikan sebagai parameter.
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // Pernyataan return yang sudah dikoreksi
        return s.area() / coverage;
    }
}