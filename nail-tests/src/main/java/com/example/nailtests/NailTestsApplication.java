package com.example.nailtests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class NailTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NailTestsApplication.class, args);


        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map);

        map.put(3, "Another three");

        System.out.println(map);

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }


    }
}
