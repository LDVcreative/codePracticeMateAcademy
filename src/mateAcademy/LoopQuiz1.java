package mateAcademy;

public class LoopQuiz1 {
    public static void main(String[] args) {
        getSum(3);

    }
    public static int getSum(int n) {
        int result = 0;

        for (int i = 1; i <= n; i = i + 1) {
            result += i;
        }

        return result;
    }


}
