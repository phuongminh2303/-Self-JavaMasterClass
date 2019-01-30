public class digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigit(125));  // 8
        System.out.println(sumDigit(10));   // 1
        System.out.println(sumDigit(-5));   // -1
        System.out.println(sumDigit(1));    // -1
    }
    public static int sumDigit(int number){
        int sum = 0;
        if (number < 10)
            return -1;
        else{
            while ( number > 0){
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }
}
