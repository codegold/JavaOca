package JavaOca.src.Pond.duck;

public class MotherDuck {
    String noise = "quack";
    void quack() {
        System.out.println(noise); //default acc is ok
    }
    private void makeNoise() {
        quack();                   //default acc is ok
    }
}
