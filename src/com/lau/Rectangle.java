package com.lau;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(){
        super();
        this.width=1;
        this.length=1;
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник длинны: " + length + " и ширины: " + width + ", " + super.toString() + "\nПериметр=" + getPerimeter();
    }

    @Override
    public double getArea() {
        System.out.print("Площадь=");
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length * width);
    }

}
