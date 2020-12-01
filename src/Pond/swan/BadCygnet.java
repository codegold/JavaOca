package JavaOca.src.Pond.swan;

import JavaOca.src.Pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //duck.quack();                  //NOT COMPILE
        //System.out.println(duck.noise); //NOT COMPILE
    }
}
