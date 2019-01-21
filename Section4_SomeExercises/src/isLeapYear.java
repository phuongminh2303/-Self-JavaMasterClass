public class isLeapYear {

    public static void main(String[] args) {
        if(isLeapYear(2000))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean isLeapYear(int year){
        if(1 < year && year < 9999){
            if ( (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
                return true;
            }
            else
                return false;
        }
        return false;
    }
}
