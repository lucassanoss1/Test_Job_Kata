public class Division {
    public static String division(String word1, int numb) throws Exception {
        if(numb < 0){
            throw new Exception("Делитель должен быть больше нуля.");
        }
        char[] chars = word1.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < chars.length / numb; i++) {
            res.append(chars[i]);
        }
        return TruncateString.truncateString(res.toString());
    }
}
