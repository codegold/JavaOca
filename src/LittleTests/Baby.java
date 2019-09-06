package src.LittleTests;

public class Baby {
    public static int play(int toy, int age) {
        int game;
        if (toy < 2)
            game = age > 1 ? 1 : 10; // p1
//        else
//            game = age > 3 ? "Ball" : "Swim"; // p2
//        return game;
        return -1;
    }
    static int[][] game;
    public static void main(String[] variables) {
        System.out.print(play(5, 2));


        String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
        System.out.println(listing.length + " " + listing[0].length);
        }
    }