package JavaOca.src.Page128multyArrays;

public class Test {
    public static void main(String[] args) {
        int[][] twoD = new int[3][2];
        twoD[0][0] = 2;
        twoD[0][1] = 11;
        twoD[1][0] = 22;


        for (int[] inner : twoD) {
            for (int outter : inner) {
                System.out.print(outter + " ");
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
        }
    }
}
