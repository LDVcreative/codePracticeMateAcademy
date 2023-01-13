package mateAcademy;

public class AgeChecking_Else_if {
    public static void main(String[] args) {
        int age = 18;
        
        if (age>=18) {
            System.out.println("Adult detected");
        } else if (age >= 11) {
            System.out.println("Teenager detected");            
        } else if (age >= 7) {
            System.out.println("Child detected");
        }
    }
}
