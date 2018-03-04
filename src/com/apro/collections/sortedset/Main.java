package com.apro.collections.sortedset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private NavigableSet<Integer> set = new TreeSet<>();

    private Main() {
//        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }

        set.add(44);

        printSet(set);


        System.out.println(">>>");

        NavigableSet<Integer> descendingSet = set.descendingSet();


        printSet(descendingSet);


    }

    public static void main(String[] args) {
        new Main();

    }

    private <T> void printSet(Set<T> set) {
        for (T s : set) {
            System.out.println(">>> " + s);
        }
    }


    public Integer getNextElement(Integer element) {
        return null;

    }

}
