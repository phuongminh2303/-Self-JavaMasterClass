public class hasTeen {

    public static void main(String[] args) {
        if (hasTeen(9,39,30))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        int i = 0;
        if ( 13 <= num1 && num1 <= 19)
            i++;
        if (13 <= num2 && num2 <= 19)
            i++;
        if (13 <= num3 && num3 <= 19)
            i++;
        if (i > 0)
            return true;
        return false;
    }
}
