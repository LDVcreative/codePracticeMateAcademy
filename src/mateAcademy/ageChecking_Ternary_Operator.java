package mateAcademy;

public class ageChecking_Ternary_Operator {
    public static void main(String[] args) {
        int age = 14;
        String message;

        if (age >=18) {
            message = "Adult detected";
        } else {
            message = "Child detected";
        }
        System.out.println(message);

        int age2 = 20;
        String message2 = (age2 >= 18) ? "You are adult" : "You are child";
        System.out.println(message2);
    }
}
