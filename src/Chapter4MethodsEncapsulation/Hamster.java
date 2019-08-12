package JavaOca.src.Chapter4MethodsEncapsulation;

public class Hamster {

    private String color;
    private int age;

    public Hamster(String color, int age) {
        this.age = age;
        this.color = color;
    }

    public Hamster(int age) {
//        this("green", 66);

        this.age = age;
        this.color = "brown";
    }

    @Override
    public String toString(){
       return age + " "+ color;
    }

    public static void main(String[] args) {
        Hamster hamster1 = new Hamster("Blue", 2);
        Hamster hamster2 = new Hamster(5);

        System.out.println(hamster1.toString());
        System.out.println(hamster2.toString());
    }
}
