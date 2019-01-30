public class Ex15_firstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        if ( number < 0)
            return -1;
        else {
            int last = number % 10;
            int first;
            while (number >= 10) {
                if (number < 10)
                    break;
                number /= 10;
            }
            first = number;
            return (last + first);
        }
    }
}
