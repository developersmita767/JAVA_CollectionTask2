//Write a program to demonstrate linkedlist and its methods(add,set,size,isEmpty,get,remove) .

import java.util.LinkedList;

public class CollectionTask2 {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Printing the LinkedList
        System.out.println("LinkedList after adding elements: " + list);

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + list.size());

        // Checking if the LinkedList is empty
        System.out.println("Is the LinkedList empty? " + list.isEmpty());

        // Getting element at index 1
        System.out.println("Element at index 1: " + list.get(1));

        // Removing element at index 1
        list.remove(1);
        System.out.println("LinkedList after removing element at index 1: " + list);

        // Adding element at index 1
        list.add(1, "Grapes");
        System.out.println("LinkedList after adding 'Grapes' at index 1: " + list);

        // Setting element at index 0
        list.set(0, "Mango");
        System.out.println("LinkedList after setting 'Mango' at index 0: " + list);
    }
}
