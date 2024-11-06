public class Numb {
    public static int numb(String word3) throws Exception {
        int number = 0;
        if (word3.matches("\\d+")) {
            number = Integer.parseInt(word3);
        }
        if (number < 1 || number > 10) {
            throw new Exception("Число должно быть от 1 до 10.");
        }

        return number;
    }
}
