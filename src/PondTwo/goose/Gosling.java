package JavaOca.src.PondTwo.goose;

import JavaOca.src.PondTwo.shore.Bird;

public class Gosling extends Bird {

    public void swim() {
        floatInWater(); //calling protected from Bird
        System.out.println(text); //calling protected from Bird
    }
}

