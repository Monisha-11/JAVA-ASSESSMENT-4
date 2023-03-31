package PROGRAM_11;

import java.util.TreeMap;
public class GREATER {
        public static void main(String[] args) {
            TreeMap<Integer, String> map = new TreeMap<Integer, String>();
            map.put(1, "one");
            map.put(3, "three");
            map.put(5, "five");
            map.put(7, "seven");

            int key = 6;

            Integer result = map.ceilingKey(key);

            if(result != null) {
                System.out.println("Least key greater than or equal to " + key + " is " + result);
            } else {
                System.out.println("There is no key greater than or equal to " + key);
            }
        }
    }


