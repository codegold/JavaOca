package JavaOca.src.Page133ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Jenny");
        myArrayList.add("Rachel");
        System.out.println(myArrayList.contains("Tom"));
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println("New size is " + myArrayList.size());

        List<String>myArrayList2 = new ArrayList<>();
        System.out.println(myArrayList.equals(myArrayList2));
    }
}
