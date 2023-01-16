package mateAcademy;

public class ArrayLesson1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        String[] names = {"John", "Jack", "Jill"};
        String [] catNames = {"Kitty", "Ditty", "Bitty"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number: numbers){
            System.out.println(number);
        }
        for (String name: names){
            System.out.println("Your name is... " + name);
        }
        names[2] = "Diana";
        for (String name: names) {
            System.out.println("Your name is... " + name);
        }

        for (String catName: catNames){
            System.out.println("Hello " + catName);
        }

    }

}
