package com.phuongminh;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 / 3; //first way to define float
        float myFloatValue2 = 5f / 3f;       //second way to define float (recommended)
        do7uble myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myFloatValue2 = " + myFloatValue2);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // Convert a number of pound to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in variable
        // 3. Print out the result
        //
        // NOTE: 1 pound = 0.45359237 kilogram
        double myPound = 12.34d;
        System.out.println(myPound + " equals " + myPound * 0.45359237 + " kilograms");
    }
}
