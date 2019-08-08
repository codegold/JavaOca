package JavaOca.src.Chapter4MethodsEncapsulation;

public class OverloadingTest {
    public static void  play(Long... l){}
    public static void  play(Object o){}
    public static void main(String[] args) {
        play(5);
        play(5L);
    }
}
