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

/*
Mentors solution

public class MakeAbbr {
  public static String makeAbbr(String fullName) {
  String[] words = fullName.split(" ");
  StringBuilder builder = new StringBuilder();

  for (String word : words){
    builder.append(word.toUppercase().charAt(0);
  }
  return builder.toString;
  }
}
 */
