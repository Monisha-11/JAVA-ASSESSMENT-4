package PROGRAM_10;
import java.util.*;
public class KEYVALUE {
        public static void main(String[] args) {
            TreeMap<String, Integer> map = new TreeMap<>();
            map.put("apple", 1);
            map.put("banana", 2);
            map.put("cherry", 3);

            String key = "banana";
            Map.Entry<String, Integer> entry = map.ceilingEntry(key);

            if (entry != null) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            } else {
                System.out.println("No key found greater than or equal to " + key);
            }
        }
    }


