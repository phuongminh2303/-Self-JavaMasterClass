public class Ex13_sumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int num) {
        if ((num > 0) && (num % 2 != 0))
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end) {
        int i, sum = 0;
        if ((start <= 0) || (end <= 0) || (start > end)) {
            return -1;
        } else {
            for (i = start; i <= end; i++) {
                if (isOdd(i))
                    sum += i;
            }
            return sum;
        }
    }
}
