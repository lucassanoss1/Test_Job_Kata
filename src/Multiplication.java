public class Multiplication {
    public static String multiplication(String word1, int numb) {
        StringBuilder res = new StringBuilder();
        res.append(String.valueOf(word1).repeat(Math.max(0, numb)));
        return TruncateString.truncateString(res.toString());
    }
}
