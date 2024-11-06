public class Min {
    public static String min(String word1, String word3, String text){
        String[] commonWords = text.split("\"");
        String comw = commonWords[1];
        String comw3 = commonWords[3];
        StringBuilder res = new StringBuilder();
        if (comw.contains(comw3)) {
            word1 = comw.replaceAll(comw3, "");

        }else {
            word1 = word1;
        }

        return TruncateString.truncateString(word1);
    }
}
