package src.OcaOcpTests;

public class StackTraceTests {
    public static void main(String[] args) {
        System.out.println("Метод Main успешно запущен");
        m1();
        System.out.println("Метод Main заканчивает свою работу");
    }

    static void m1() {
        System.out.println("Первый метод передаёт привет!(m1)");
        m2();
    }
//    static void m1() {
//        try {
//            System.out.println("Первый метод передаёт привет!(m1)");
//            m2();
//        } catch (ArithmeticException err) {
//            System.out.println(err.getMessage());
//        }
//    }

    static void m2() {
        int x = 10;
        int y = 0;
        double z = x / y;
        System.out.println(z);
        System.out.println("Method Two - m2");
    }
}
