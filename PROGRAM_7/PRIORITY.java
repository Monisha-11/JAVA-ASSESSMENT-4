package PROGRAM_7;

import java.util.PriorityQueue;
public class PRIORITY {

        public static void main(String[] args) {
            // Create a new Priority Queue
            PriorityQueue<String> queue = new PriorityQueue<>();

            // Add some elements to the queue
            queue.add("apple");
            queue.add("banana");
            queue.add("pear");
            queue.add("orange");

            // Convert the queue to a string representation
            String queueAsString = queue.toString();

            // Print the string representation
            System.out.println("Queue as string: " + queueAsString);
        }
    }


