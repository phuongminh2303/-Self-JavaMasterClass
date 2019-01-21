public class hasEqualSum {

    public static void main(String[] args) {
        if (hasEqualSum(1,1,2))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if ( (num1 + num2) == num3)
            return true;
        else
            return false;
    }
}
