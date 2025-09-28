package com.company.model;

import com.company.core.abstracts.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle(double width, double lenght) {
        super("Rectangle");

        this.width = width;
        this.lenght = lenght;
    }

    public double area() {
        return width * lenght;
    }

    public String toString() {
        return super.toString() + "{" + "width=" + width + ", lenght=" + lenght + '}';
    }
}
