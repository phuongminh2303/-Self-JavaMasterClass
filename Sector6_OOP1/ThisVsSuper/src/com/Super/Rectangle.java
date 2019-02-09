package com.Super;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this (x, y , 1 , 2); // call 2nd constructor
    }

    public Rectangle(int x, int y, int width, int height){
        super(x,y); // call constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
