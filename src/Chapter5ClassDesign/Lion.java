package src.Chapter5ClassDesign;

public class Lion extends Animal {
    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }

    public static void main(String[] args) {
       new Lion().roar();
    }

}
