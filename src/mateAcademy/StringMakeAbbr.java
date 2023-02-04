package mateAcademy;

public class StringMakeAbbr {
    public static String makeAbbr(String fullName) {
        // write your code below this line
        String[] stringToArray = fullName.split(" ");
        String abbrSmall = "";
        for(int i = 0; i < stringToArray.length; i++){
            String words = stringToArray[i];
            abbrSmall += words.charAt(0);
        }
        return (abbrSmall.toString()).toUpperCase();
        // write your code above this line
    }
}
