package org.example.Q3;

import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        input.close();

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        ArrayList<String> anagrams = new ArrayList<>();
        findAnagrams("", word.length(), charCount, anagrams);

        System.out.println("Anagrams of " + word + ":");
        for (String anagram : anagrams) {
            System.out.println(anagram);
        }
    }

    private static void findAnagrams(String prefix, int remaining, HashMap<Character, Integer> charCount, ArrayList<String> anagrams) {
        if (remaining == 0) {
            anagrams.add(prefix);
            return;
        }
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                findAnagrams(prefix + c, remaining - 1, charCount, anagrams);
                charCount.put(c, count);
            }
        }
    }
}
