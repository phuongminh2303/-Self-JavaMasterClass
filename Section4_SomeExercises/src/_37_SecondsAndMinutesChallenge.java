public class _37_SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(180, 50);
        System.out.println("Second method: ");
        getDurationString(3520);
    }

    public static void getDurationString(int minute, int second){
        if ( minute < 0 || (second < 0 || second > 59))
            System.out.println("Invalid value");
        else{
            int hour;
            hour = minute / 60;
            minute %= 60;
            System.out.println(hour + "h " + minute + "m " + second + "s");
        }
    }

    public static void getDurationString(int second){
        if ( second < 0)
            System.out.println("Invalid value");
        else{
            int minute;
            minute = second / 60;
            second %= 60;
            System.out.println(minute + "m" + second + " s");
            getDurationString(minute, second);
        }
    }
}
