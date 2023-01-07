package mateAcademy;

public class MethodBoolean {
    public static void main(String[] args) {
        boolean isFirstNumEven = isEven(3);
        System.out.println(isFirstNumEven);
        boolean isSecondNumEven = isEven(6);
        System.out.println(isSecondNumEven);

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
