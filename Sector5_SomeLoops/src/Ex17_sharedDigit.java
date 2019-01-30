public class Ex17_sharedDigit {
    public static void main(String[] args) {
        if(hasSharedDigit(15,55))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if ( (num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99))
            return false;
        else{
            int num1_digit1 = num1 % 10;
            num1 /= 10;
            int num1_digit2 = num1 % 10;

            int num2_digit1 = num2 % 10;
            num2 /= 10;
            int num2_digit2 = num2 % 10;
            if ( (num1_digit1 == num2_digit1) || (num1_digit1 == num2_digit2)
                    || (num1_digit2 == num2_digit1) || (num1_digit2 == num2_digit2))
                return true;
            else
                return false;
        }
    }
}
