public class FirstNumb {
    public static String firstNumb(String text) throws Exception {
        String[] ver = text.split(" ");
        if(ver[0].matches("\\d")){
            System.out.println("Недопустимый формат");
            System.exit(1);
        }
        return text;
    }
}
