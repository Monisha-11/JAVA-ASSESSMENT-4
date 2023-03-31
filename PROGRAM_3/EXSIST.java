package PROGRAM_3;

import java.util.LinkedList;
public class EXSIST {

        public static void main(String[] args) {

            // Creating a LinkedList
            LinkedList<String> list = new LinkedList<>();

            // Adding elements to the LinkedList
            list.add("apple");
            list.add("banana");
            list.add("cherry");
            list.add("date");
            list.add("elderberry");

            // Element to check if it exists in the LinkedList
            String elementToCheck = "ELDERBERRY";

            // Checking if the element exists in the LinkedList
            if (list.contains(elementToCheck)) {
                System.out.println("The element '" + elementToCheck + "' exists in the LinkedList");
            } else {
                System.out.println("The element '" + elementToCheck + "' does not exist in the LinkedList");
            }
        }
    }


