package algorithms.pattern_searching;

public class NaivePatternSearching {

    private static int naivePatternSearch(String textString, String pattern) {

        int textStringLength = textString.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textStringLength - patternLength; i++) {

            char currentTextChar = textString.charAt(i);
            char firstPatternChar = pattern.charAt(0);
            System.out.println("CharAt Text i > " + i + " = " + currentTextChar);
            System.out.println("First CharAt Pattern = " + currentTextChar);
            System.out.println("========================================");
            if (currentTextChar == firstPatternChar) {
                for (int j = 0; j < patternLength; j++) {
                    char t = textString.charAt(i + j);
                    char p = pattern.charAt(j);
                    System.out.println("T = " + t + " ___ " + "P = " + p);
                    if (t != p) {
                        break;
                    }
                    if (j == patternLength - 1) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String textString = "AABACCBBAAFF";
        String pattern = "FF";
        System.out.println("Pattern Found at index : " + naivePatternSearch(textString, pattern));
    }
}