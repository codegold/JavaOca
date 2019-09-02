package JavaOca.src.Chapter6Exceptions;

public class LittleGirl {

    public static void main(String[] args) throws InterruptedException {

        try {
            seeAnimals();
            Thread.sleep(1100);
            fall();
            Thread.sleep(1100);
        } catch (Exception e) {
            getHugFromDaddy();
            Thread.sleep(1100);
        } finally {
            seeMoreAnimals();
            Thread.sleep(1100);
        }
        goHome();
    }


    private static void seeAnimals() {
        System.out.println("See animals.");
    }

    private static void goHome() {
        System.out.println("Go home.");
    }

    private static void fall() {
        System.out.println("Girl is fall.");
    }

    private static void seeMoreAnimals() {
        System.out.println("See more animals.");
    }

    private static void getHugFromDaddy() {
        System.out.println("Get Hugs from daddy.");
    }
}