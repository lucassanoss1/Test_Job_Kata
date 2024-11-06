public class TruncateString {
    public static String truncateString(String str) {
        if (str.length() > 40) {
            return str.substring(0, 40) + "...";
        }
        return  str;
    }
}
