package mateAcademy;

public class BooleanHasAccess {
    public static void main(String[] args) {
        int age = 15;
        boolean hasAccess = age >=18;
        System.out.println("Your age is " + age + " (" + hasAccess + ")");

        if (hasAccess){    /* this code means next: if boolean veriable "hasAccess" is true, than do next line*/
            System.out.println("So the access is granted");
        } else {
            System.out.println("And this means that access denied");
        }
    }
}
