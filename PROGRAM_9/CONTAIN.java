package PROGRAM_9;

import java.util.*;
public class CONTAIN {

        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("apple", 1);
            map.put("banana", 2);
            map.put("cherry", 3);

            Set<String> keySet = map.keySet();
            System.out.println("Keys: " + keySet);
        }
    }


