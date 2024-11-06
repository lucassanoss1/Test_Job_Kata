import java.util.Scanner;

public class StringSplitter {
    public static String calc() throws Exception {
        System.out.println("ВВедите ваше выражение в формате \"слово\" + \"слово/цифра\"");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine().trim();
        text = FirstNumb.firstNumb(text);
        String[] str = text.split(" \\W ");
        String word1 = str[0];
        String[] oper = text.split("\"");
        String operator = oper[2].replaceAll("\\d","").replaceAll(" ","");
        String word3 = str[1];

        switch (operator){
            case "+":
                word1 = word1 + word3;
                return TruncateString.truncateString(word1).replaceAll("\"","");
            case "-":
                word1 = Min.min(word1, word3, text).replaceAll("\"","");
                return TruncateString.truncateString(word1);
            case "*" :
                int y = Numb.numb(word3);
                word1 = Multiplication.multiplication(word1, y).replaceAll("\"","");
                return TruncateString.truncateString(word1);
            case "/":
                int x = Numb.numb(word3);
                word1 = Division.division(word1, x).replaceAll("\"","");
                return TruncateString.truncateString(word1);
            default:
                throw new Exception("Неподдерживаемая операция.");
        }
    }
}
