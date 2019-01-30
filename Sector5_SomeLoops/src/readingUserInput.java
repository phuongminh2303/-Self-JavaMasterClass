import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        int year = in.nextInt();

        in.nextLine(); // very important

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your age : " + (2018 - year));
    }
}
