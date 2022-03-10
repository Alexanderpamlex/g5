package com.lau;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public double resize(int percent) {
       return setRadius((getRadius()/100)*percent);
    }
}
