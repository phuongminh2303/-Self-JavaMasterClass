public class Ex19_greatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int num1, int num2){
        int gcd = 0;
        if ((num1 < 10) || (num2 < 10))
            return -1;
        else{
            int i;
            for ( i = 1; i < (num1 + num2) /2 ; i++){
                if ( (num1 % i == 0) && (num2 % i == 0))
                    gcd = i;
            }
            return gcd;
        }
    }
}
