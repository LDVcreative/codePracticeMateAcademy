package mateAcademy;

public class MarkStringEnds {
    public static String[] markStringEnds(String originalString) {

        int lastIndex = originalString.length() - 1;
        String firstLetter = originalString.substring(0, 1).toUpperCase();
        String lastLetter = originalString.substring(lastIndex).toUpperCase();

        String wordFirstLetterUpCase = firstLetter + originalString.substring(1);
        String wordLastLetterUpCase = originalString.substring(0, lastIndex) + lastLetter;

        return new String[]{wordFirstLetterUpCase, wordLastLetterUpCase};
    }
}
