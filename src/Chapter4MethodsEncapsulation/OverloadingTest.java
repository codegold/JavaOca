package JavaOca.src.Chapter4MethodsEncapsulation;

public class OverloadingTest {
    public static void  play(Long... l){}
    public static void  play(Object o){}
    private int number;

    public OverloadingTest(int num){
        this.number = num;

    }

    public static void main(String[] args) {
        play(5);
        play(5L);
        OverloadingTest olt = new OverloadingTest(2);
    }
}
