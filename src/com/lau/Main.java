package com.lau;

public class Main {

    public static void main(String[] args) {
	MovableCircle k = new MovableCircle(1,3,2);
        System.out.println(k);
        k.moveRight();
        System.out.println(k);
        k.moveUp();
        System.out.println(k);
    MovablePoint a = new MovablePoint(1,2);
        System.out.println(a);
        a.moveLeft();
        System.out.println(a);
        a.moveDown();
        System.out.println(a);

        ResizableCircle f = new ResizableCircle(10);
        System.out.println(f.resize(80));


    }
}
