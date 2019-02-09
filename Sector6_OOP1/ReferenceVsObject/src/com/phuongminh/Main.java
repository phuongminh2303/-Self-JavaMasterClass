package com.phuongminh;

public class Main {

    public static void main(String[] args) {
	    House blueHouse = new House("Blue");
	    House anotherHouse = blueHouse; // this is 2 references point to the same object

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(anotherHouse.getColor()); // blue because both of them point to the same object

        anotherHouse.setColor("Yellow");
        System.out.println(anotherHouse.getColor()); // yellow
        System.out.println(blueHouse.getColor()); // also yellow because the object has been changed

        House greenHouse = new House("Green");
        anotherHouse = greenHouse;
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green because "anotherHouse" now points to greenHouse
    }
}
