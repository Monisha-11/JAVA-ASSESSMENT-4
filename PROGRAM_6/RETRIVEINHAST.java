package PROGRAM_6;
import java.util.TreeSet;
public class RETRIVEINHAST {

        public static void main(String[] args) {
            TreeSet<String> treeSet = new TreeSet<>();

            // Add some elements to the TreeSet
            treeSet.add("apple");
            treeSet.add("banana");
            treeSet.add("orange");

            // Retrieve and remove the last element
            String lastElement = treeSet.pollLast();

            System.out.println("Original TreeSet: " + treeSet);
            System.out.println("Last Element Removed: " + lastElement);
            System.out.println("Updated TreeSet: " + treeSet);
        }
    }


