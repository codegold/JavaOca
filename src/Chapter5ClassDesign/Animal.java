package JavaOca.src.Chapter5ClassDesign;

public abstract class Animal {
    protected int age;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}


