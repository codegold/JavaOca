package JavaOca.src.PackageA;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        // INSERT CODE HERE
        //puzzle.reverse();
        puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length()-1);
        System.out.println(puzzle);

    }
}
