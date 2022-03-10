package com.lau;

public class MovableCircle implements Movable{

    private MovablePoint center;

    private int radius;

    public MovableCircle(int x,int y,int radius){

        center = new MovablePoint(x,y);
        this.radius = radius;

    }

    public MovableCircle(int x,int y,int xSpeed, int ySpeed,int radius){

        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "{" + "center=" + center + ", radius=" + radius + '}';
    }

    @Override
    public void moveUp() {
        center.setY(center.getY() + center.getySpeed());
    }

    @Override
    public void moveDown() {
        center.setY(center.getY() - center.getySpeed());
    }

    @Override
    public void moveLeft() {
        center.setX(center.getX() - center.getxSpeed());
    }

    @Override
    public void moveRight() {
        center.setX(center.getX() + center.getxSpeed());
    }
}
