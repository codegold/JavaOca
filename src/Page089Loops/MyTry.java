package JavaOca.src.Page089Loops;

public class MyTry {
    public static void main(String[] args) {
        int[][] listMy = {{1, 2, 3},{2, 4, 6},{8, 7, 2}};
        int searchNumber = 2;
        int posInner = -1;
        int posOutter = -1;

        PARENT_LOOP: for (int i = 0; i < listMy.length; i++) {
            for (int j = 0; j < listMy[i].length ; j++) {
                if (listMy[i][j] == searchNumber) {
                    posOutter = i;
                    posInner = j;
                    break PARENT_LOOP;
                }
            }
        }


        if (posOutter == -1 || posInner == -1) {
            System.out.println(searchNumber+ "Not found.");
        } else {
            System.out.println(searchNumber+ " Founded at: outter: "
                    +posOutter+ " and inner : " +posInner);
        }
    }
}
