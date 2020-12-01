package JavaOca.src.Static;

public class Static {
    private String name = "Static class";

    public static void first() {

    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        first();
        second();
        //third(); // DOES NOT COMPILE
        //Static.third(); // DOES NOT COMPILE
        new Static().third();//to call third as an instance method

    }
}
