import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = in.next().charAt(0);

        switch (character){
            case 'a':
                System.out.println("The character is: " + character);
                break;
            case 'b':
                System.out.println("The character is: " + character);
                break;

        }
    }
}
