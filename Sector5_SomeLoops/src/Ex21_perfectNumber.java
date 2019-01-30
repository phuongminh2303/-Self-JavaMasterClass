public class Ex21_perfectNumber {
    public static void main(String[] args) {
        if(isPerfectNumber(-1))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean isPerfectNumber(int num){
        if ( num < 1)
            return false;
        else {
            int sum_div = 0;
            for (int i = 1; i < num; i++){
                if(num % i == 0)
                    sum_div += i;
            }
            if (sum_div == num)
                return true;
            else
                return false;
        }
    }
}
