package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> createList(int size) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++)
            list.add(random.nextInt(-1000, 1000));
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = createList(1000);

        ShellSort ss = new ShellSort();
        ss.sort(list);
        System.out.println("Porownania: " + ss.getComparisons() + "\tZamiany: " + ss.getSwaps());
    }
}
