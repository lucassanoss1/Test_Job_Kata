public class TruncateString {
    public static String truncateString(String str) {
        str = str.replaceAll("\"","");
        if (str.length() > 40) {
            return str.substring(0, 40) + "...";
        }
        return  str;
    }
}
