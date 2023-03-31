package PROGRAM_2;

import java.util.LinkedList;
public class RETRIVE {

        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();

            // Adding elements to the linked list
            linkedList.add("Java");
            linkedList.add("Python");
            linkedList.add("C++");

            // Retrieving the first element of the linked list
            String firstElement = linkedList.peekFirst();

            // Printing the first element of the linked list
            System.out.println("First Element: " + firstElement);
        }
    }
