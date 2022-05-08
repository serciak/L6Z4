package com.company;

import java.util.ArrayList;

public class ShellSort {

    private int swaps;
    private int comparisons;

    public ShellSort() {
    }

    private ArrayList getGaps(int size) {
        ArrayList<Integer> arr = new ArrayList<>();

        //for(int i = 1; i < size; i = (3*i)+1)
            arr.add(1);
        for(int i = 2; i < size; i = i*i)
            arr.add(i);
        return arr;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        int size = list.size();
        ArrayList<Integer> gaps = getGaps(size);

        for(int i = gaps.size()-1; i >= 0; --i) {
            int gap = gaps.get(i);

            for(int j = gap; j < size; j++) {
                int temp = list.get(j);
                int l;
                comparisons++;
                for(l = j; l >= gap && list.get(l - gap) > temp; l -= gap) {
                    list.set(l, list.get(l - gap));
                    swaps++;
                }
                swaps++;
                list.set(l, temp);
            }
        }
        return list;
    }

    public int getSwaps() {
        return swaps;
    }

    public int getComparisons() {
        return comparisons;
    }
}
