public class areEqualByThreeDecimalPlaces {

    public static void main(String[] args) {
        if(areEqualByThreeDecimalPlaces(3.123, 3.124))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double diff = Math.abs(num1 - num2) * 1000;
        if ( 0 <= diff && diff < 0.9)
            return true;
        return false;
    }
}
