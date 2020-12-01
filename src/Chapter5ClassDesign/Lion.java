package JavaOca.src.Chapter5ClassDesign;

import static CCI.Animal.Animal.getAge;

public class Lion extends Animal {

    public String name;

    public String getName(){
        return name;
    }

    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }



    public static void main(String[] args) {
       new Lion().roar();
    }

}
