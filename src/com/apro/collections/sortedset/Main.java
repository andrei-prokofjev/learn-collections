package com.apro.collections.sortedset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private Main() {
        NavigableSet<Integer> set = new TreeSet<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < 5; i++) {
            set.add(i);
        }

        set.add(44);

        printSet(set);


        System.out.println(">>>");

        NavigableSet<Integer> descendingSet = set.descendingSet();
        printSet(descendingSet);

        System.out.println(">>> ");


    }

    public static void main(String[] args) {
        new Main();

    }

    private <T> void printSet(Set<T> set) {
        for (T s : set) {
            System.out.println(">>> " + s);
        }
    }


}
