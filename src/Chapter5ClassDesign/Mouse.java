package JavaOca.src.Chapter5ClassDesign;

public class Mouse extends Rodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) throws InterruptedException {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();

        Thread.sleep(555);
        try {
            mouse.getMouseDetails();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
