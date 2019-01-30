public class minutesToYear {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        long minDay = 60 * 24;
        long minYear = minDay * 365;
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else{
            long x = minutes;
            long y = x / minYear;
            x -= y*minYear;
            long d = x / minDay;
            System.out.println(minutes + " min = " + y + " y and " + d + " d");
        }
    }
}
