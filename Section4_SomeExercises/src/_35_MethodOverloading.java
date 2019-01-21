public class _35_MethodOverloading {
    public static void main(String[] args) {
        int sum2 = sum(1,2);
        System.out.println("sum 2 numbers: " + sum2);

        int sum3 = sum(1,2,3);
        System.out.println("sum 3 numbers: " + sum3);

        int sum4 = sum(1,2,3,4);
        System.out.println("sum 4 numbers: " + sum4);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
