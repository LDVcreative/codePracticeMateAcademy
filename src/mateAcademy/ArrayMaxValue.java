package mateAcademy;

public class ArrayMaxValue {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 10, 23, 2};

    }

    public static int maxNumberOfArray (int[] numbers){
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max number is " + maxNumber);
        return maxNumber;
    }


}
