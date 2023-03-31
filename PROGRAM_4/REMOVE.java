package PROGRAM_4;

import java.util.HashSet;
public class REMOVE {


        public static void main(String[] args) {

            // Creating a HashSet
            HashSet<String> set = new HashSet<>();

            // Adding elements to the HashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");

            // Removing all elements from the HashSet using clear() method
            set.clear();

            // Displaying the size of the HashSet after removing all elements
            System.out.println("Size of HashSet after removing all elements: " + set.size());
        }
    }


