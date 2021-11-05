public class StringCalculator {
    public char customSeparator;
    public char separator1 = ',';
    public char separator2 = ':';

    public int add(String text) {
        int result = 0;

        if (text == null || text.isEmpty()) {
            return result;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        String[] number = text.split(",|:");

        for (String s : number) {
            result += Integer.parseInt(s);
        }

        return result;

    }
}



