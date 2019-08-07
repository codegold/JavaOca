package JavaOca.src.DataPassByValue;

public class DataPassByValueTwo {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        swap(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
