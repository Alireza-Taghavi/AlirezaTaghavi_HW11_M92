package org.example.Q4;

public class Demo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // Add nodes to the list
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println("List after adding nodes: " + list);

        // Add node at specific index
        list.add(2, 12);
        System.out.println("List after adding node at index 2: " + list);

        // Remove node by index
        list.remove(3);
        System.out.println("List after removing node at index 3: " + list);

        // Search for a value in the list
        System.out.println("Index of value 10 in list: " + list.indexOf(10));
        System.out.println("Index of value 25 in list: " + list.indexOf(25));
    }
}

