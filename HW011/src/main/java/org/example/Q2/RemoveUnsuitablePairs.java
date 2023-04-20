package org.example.Q2;

import java.util.ArrayList;

public class RemoveUnsuitablePairs {
    public static void main(String[] args) {
        // Example input
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(3);

        // Call method to remove unsuitable pairs
        removeUnsuitablePairs(list);

        // Print modified list
        System.out.println(list);
    }

    public static void removeUnsuitablePairs(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size() - 1) {
            if (i % 2 == 0 && list.get(i) > list.get(i + 1)) {
                list.remove(i + 1);
                list.remove(i);
                if (i > 0) {
                    i -= 2;
                }
            } else {
                i += 2;
            }
        }
        if (list.size() % 2 != 0) {
            list.remove(list.size() - 1);
        }
    }
}
