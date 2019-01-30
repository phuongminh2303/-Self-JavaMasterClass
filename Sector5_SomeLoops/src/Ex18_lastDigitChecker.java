public class Ex18_lastDigitChecker {
    public static void main(String[] args) {
        if(hasSameLastDigit(9,99,999))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int last1, last2, last3;
        if ( (num1 < 10) || (num1 > 1000) || (num2 < 10) || (num2 > 1000)
                || (num3 < 10) || (num3 > 1000))
            return false;
        else{
            last1 = num1 % 10;
            last2 = num2 % 10;
            last3 = num3 % 10;
            if ( (last1 == last2) || (last2 == last3) || (last3 == last1))
                return true;
            else
                return false;
        }
    }
}
