public class BarkingDog {

    public static void main(String[] args) {
        if (bark(true, 25))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean bark(boolean barking, int hour){
        if (!barking)
            return false;
        else if ((0 <= hour && hour <8) || (22 < hour && hour <= 23))
            return true;

        return false;
    }
}