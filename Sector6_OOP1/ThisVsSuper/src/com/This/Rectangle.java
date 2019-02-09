package com.This;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public Rectangle() {
        this(1, 2); // call 2nd constructor
    }

    //2nd constructor
    public Rectangle(int width, int height) {
        this(5, 6, width, height); // call 3rd constructor
    }

    //3rd constructor
    public Rectangle(int x, int y, int width, int height) {
        // initialize all variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // get data
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
