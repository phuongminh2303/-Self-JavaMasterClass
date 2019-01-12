package com.phuongminh;

public class Main {

    public static void main(String[] args) {
        // 1. Create a double variable with value 20
        // 2. Create a second variable of type double with value of 80
        // 3. Add both number up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder of the sum
        // from #3 divided by 40
        // 5. Write a "if" statement that display a message " Total was over the
        // limit" if the remaining total (#4) is equal to 20 or less

        double firstNum = 20d;
        double secondNum = 80d;
        double total = (firstNum + secondNum) * 25;

        double remainder = total % 40;
        if (remainder <= 20)
            System.out.println("Total was over the limit");
        else
            System.out.println("Yes");


    }
}
