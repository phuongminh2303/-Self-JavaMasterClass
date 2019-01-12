package com.phuongminh;

public class Main {

    public static void main(String[] args) {
	    char myChar = '\u024E';
        System.out.println("myChar = " + myChar);

        boolean isMale = true;
        System.out.println("I'm a boy? " + isMale);

        // 1. Find the code for the registered symbol.
        // 2. Create a variable of type char and assign it the unicode value for
        // that symbol
        // 3. Display that on the screen.

        char registered = '\u00AE';
        System.out.println("registered = " + registered);
    }
}
