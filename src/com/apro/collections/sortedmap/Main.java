package com.apro.collections.sortedmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    private Main() {

        Map<Integer, String> map = new LinkedHashMap<>(5, 1, true);


        map.put(1, "к");
        map.put(3, "c");
        map.put(2, "b");
        map.put(4, "d");


        printMap(map);

        System.out.println(">>>>");

        map.get(3);
        map.get(3);
        map.get(1);

        printMap(map);


    }

    public static void main(String[] args) {
        new Main();
    }

    private <K, V> void printMap(Map<K, V> map) {
        Set<Map.Entry<K, V>> entries = map.entrySet();

        for (Map.Entry<K, V> entry : entries) {
            System.out.println(">>> e: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
