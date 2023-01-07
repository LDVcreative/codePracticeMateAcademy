package mateAcademy;

public class MethodRectangle {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 6;

        printRectangleInfo(10,2);
        printRectangleInfo(3,4);
        printRectangleInfo(a1, b1);

    }
    // METHOD: Rectangle parameters
    public static void printRectangleInfo(int a, int b){
        int perimeter = 2 * (a + b);
        int square = a * b;

        System.out.println("Ractangle parameters is " + a + " " + "and" + " " + b);
        System.out.println("Recatngle Perimeter is " + perimeter);
        System.out.println("Rectangle Square is " + square);
        System.out.println("__________________________________");

    }

}
