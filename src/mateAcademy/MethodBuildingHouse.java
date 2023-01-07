package mateAcademy;

public class MethodBuildingHouse {
    public static void main(String[] args) {


        String littleHouse = buildHouse(5, "green");
        String bigHouse = buildHouse(9, "red");

        System.out.println(buildHouse(3, "yellow"));
        System.out.println(littleHouse);
        System.out.println(bigHouse);

    }
    public static String buildHouse(int numberOfFloors, String color){
        String buildingParameters = color + " " + numberOfFloors + "-floors building";
        return buildingParameters;
    }



}
