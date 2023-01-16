package mateAcademy;

public class ArrayLesson2 {
    public static void main(String[] args) {
        int[] numbersOfCars = new int[4];
        numbersOfCars[0] = 1;
        numbersOfCars[1] = 2;
        numbersOfCars[2] = 3;
        numbersOfCars[3] = 4;
        for (int i = 0; i < numbersOfCars.length; i++){
            System.out.println(numbersOfCars[i]);
        }

        int[] numberOfPlayers = new int[11];
        for (int i = 0; i < numberOfPlayers.length; i++){
            numberOfPlayers[i] = i +1;
            System.out.println(numberOfPlayers[i]);
        }

            }


}
