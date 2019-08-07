package JavaOca.src.DataPassByValue;

public class DataPassBV {
    public static void main(String[] args) {
        int number = 11;
        String letters = "abc";
        letters = letters(letters);

        number(number);
        System.out.println(number(number));
        System.out.println(number + letters);

    }

    public static int number(int num) {
        ++num;
        return ++num;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
