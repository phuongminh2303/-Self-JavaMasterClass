public class Ex23_flourPackProblem {
    public static void main(String[] args) {
        if(canPack(2,7,18)) // type your test cases here
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean canPack(int big, int small, int goal){
        if ( (big < 0) || (small < 0) || (goal < 0))
            return false;

        int total = big * 5 + small;
        if (total >= goal){
            for (int i = 0; i <= big; i++){
                for (int j = 0; j <= small; j++){
                    if ((i*5 + j) == goal)
                        return true;
                }
            }
        }
        return false;
    }
}
