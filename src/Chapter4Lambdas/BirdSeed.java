package JavaOca.src.Chapter4Lambdas;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() { // LINE 1
        this(2);
        call = false;
// LINE 2
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
