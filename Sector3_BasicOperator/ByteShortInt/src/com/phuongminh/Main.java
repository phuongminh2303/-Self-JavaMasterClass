package com.phuongminh;

public class Main {

    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and it to any valid int number.
        // 4. Create a variable of type long, and make it value equal to
        // 50000 + 10 times of the sum of the bytes, plus the short plus the int.

        byte myByteValue = 8;
        byte myNewByteValue = (byte) (myByteValue / 2); // need to define
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myShortValue = 128;
        short myNewShortValue = (short) (myShortValue / 2); // need to define
        System.out.println("myNewShortValue = " + myNewShortValue);

        int myIntValue = 1000;
        int myNewIntValue = myIntValue / 2;
        System.out.println("myNewIntValue = " + myNewIntValue);

        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println("myLongValue = " + myLongValue);

        short totalShort = (short) (1000 + (15 * (myByteValue + myShortValue + myIntValue)));
        System.out.println("totalShort = " + totalShort);

        /*Note: Byte, short need to define exactly in expression because the computer
        automatically define expression as INT type.
        Long doesn't need to define, because long type is bigger than int :)) */
    }
}
