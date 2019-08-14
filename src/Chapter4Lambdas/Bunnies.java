package JavaOca.src.Chapter4Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Bunnies {
    public static void main(String[] args) {
        List<String> bunniesList = new ArrayList<>();
        bunniesList.add("Long ear");
        bunniesList.add("Floppy");
        bunniesList.add("Hoppy");
        System.out.println(bunniesList);
        bunniesList.removeIf(name -> name.charAt(0) != 'H');
        System.out.println(bunniesList);

    }
}