package mateAcademy;

public class MethodBuildingHouse {
    public static void main(String[] args) {


        String littleHouse = buildHouse(5);
        String bigHouse = buildHouse(9);

        System.out.println(buildHouse(3));
        System.out.println(littleHouse);
        System.out.println(bigHouse);

    }
    public static String buildHouse(int numberOfFloors){
        return numberOfFloors + "-floors building";
    }



}
