package com.company.model;

import com.company.core.abstracts.Shape;

public class Cylinder extends Shape {
    protected double radius;
    protected double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double baseArea() {
        return Math.PI * radius * radius;
    }

    public double area()
    {
        return baseArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() +  "{" + "radius=" + radius + ", height=" + height + '}';
    }
}
