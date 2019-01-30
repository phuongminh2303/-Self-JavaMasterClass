public class Ex14_numberPalindrome {
    public static void main(String[] args) {
        if(isPalindrome(1001))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;

        while (number != 0){
            reverse = reverse*10 + number % 10;
            number /= 10;
        }
        System.out.println("Reverse: " + reverse);
        if ( original == reverse)
            return true;
        else
            return false;
    }
}
