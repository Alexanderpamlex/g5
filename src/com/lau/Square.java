package com.lau;

public class Square extends Rectangle{

    private double side;

    public Square(){
        super();
        side = getLength();
    }

    public Square(double side){
        super();
        this.side = side;
    }

    public Square(double side, String color){
        setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    public String toString(){
        return "Квадрат со сторонами размером: " + side +", " + super.toString();
    }

}
