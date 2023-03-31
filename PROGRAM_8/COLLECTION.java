package PROGRAM_8;

import java.util.*;
public class COLLECTION {
        public static void main(String[] args) {
            // Create a new HashMap and populate it with some key-value pairs
            Map<String, String> myMap = new HashMap<>();
            myMap.put("key1", "value1");
            myMap.put("key2", "value2");
            myMap.put("key3", "value3");

            // Get the collection view of the values in the map
            Collection<String> values = myMap.values();

            // Print out the values in the collection
            for (String value : values) {
                System.out.println(value);
            }
        }
    }

