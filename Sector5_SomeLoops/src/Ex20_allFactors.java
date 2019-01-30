public class Ex20_allFactors {
    public static void main(String[] args) {
        printFactors(6);
        System.out.println();
        printFactors(32);
        System.out.println();
        printFactors(10);
        System.out.println();
        printFactors(-1);
    }

    public static void printFactors(int num){
        if ( num < 1)
            System.out.println("Invalid Value");
        else{
            for ( int i = 1; i <= num; i++){
                if ( num % i == 0){
                    System.out.print( i + " " );
                }
            }
        }
    }
}
