package JavaOca.src.Pond.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise); //private acc ok
    }

    private void makeNoise() {
        quack();                  //private acc ok
    }
}
