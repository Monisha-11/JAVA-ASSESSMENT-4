package PROGRAM_5;

import java.util.HashSet;
public class COMPAREHASH {



        public static void main(String[] args) {
            HashSet<String> set1 = new HashSet<>();
            set1.add("apple");
            set1.add("banana");
            set1.add("orange");

            HashSet<String> set2 = new HashSet<>();
            set2.add("banana");
            set2.add("kiwi");
            set2.add("orange");

            // compare the two sets
            boolean isEqual = set1.equals(set2);

            System.out.println("HashSet 1: " + set1);
            System.out.println("HashSet 2: " + set2);

            if (isEqual) {
                System.out.println("The two hash sets are equal.");
            } else {
                System.out.println("The two hash sets are not equal.");
            }
        }
    }


