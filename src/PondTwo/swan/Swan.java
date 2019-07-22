package JavaOca.src.PondTwo.swan;

import JavaOca.src.PondTwo.shore.Bird;

public class Swan extends Bird { // in different package than Bird
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanToSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text); // package access to superclass
    }

    public void helpOtherBirdToSwim() {
        Bird other = new Bird();
        //other.floatInWater(); //DOES NOT COMPILE
        //System.out.println(other.text); //DOES NOT COMPILE
    }
}
