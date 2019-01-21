public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }
    public static void checkNumber(int num){
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0 )
            System.out.println("Negetive");
        else
            System.out.println("Zero");
    }
}
