package com.lau;

public class Circle extends Shape {

    protected double radius;

    public Circle(){
        super();
        radius = 1;
    }

    public Circle(double radius){
        setColor("White");
        this.radius = radius;
    }

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public String toString() { return "Круг радиуса: "+radius+" и цвета: "+getColor() + " Площадь="+ getArea()+" Периметр=" + getPerimeter(); }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius*Math.PI*Math.PI;
    }

}
