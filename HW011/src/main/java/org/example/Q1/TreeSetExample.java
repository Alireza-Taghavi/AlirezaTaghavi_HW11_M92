package org.example.Q1;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create two TreeSets and fill them with 10 random characters
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            set1.add(c);
            c = (char) (rand.nextInt(26) + 'a');
            set2.add(c);
        }
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Find the intersection (common elements) of the two sets
        TreeSet<Character> intersection = getIntersection(set1, set2);
        System.out.println("Intersection: " + intersection);

        // Find the union (all elements from both sets) of the two sets
        TreeSet<Character> union = getUnion(set1, set2);
        System.out.println("Union: " + union);
    }

    public static TreeSet<Character> getIntersection(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> result = new TreeSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static TreeSet<Character> getUnion(TreeSet<Character> set1, TreeSet<Character> set2){
        TreeSet<Character> union = new TreeSet<>(set1);
        union.addAll(set2);
        return union;
    }
}
