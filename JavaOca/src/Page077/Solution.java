package JavaOca.src.Page077;



public class Solution {
    public static void main(String[] args) {


        String s = "javaisthebest";
        char[] charArr = s.toCharArray();
        String newString = "";
        for (int i = charArr.length-1; i>=0; i--) {
            newString += charArr[i];
        }
        System.out.println(newString);

        String reversedString = new StringBuffer(s).reverse().toString();

        System.out.println(reversedString);

    }
}