
package PROGRAM_1;
import java.util.ArrayList;
import java.util.List;
public class LIST {
        public static void main(String[] args) {
            List<String> list1 = new ArrayList<>();
            list1.add("apple");
            list1.add("banana");

            List<String> list2 = new ArrayList<>();
            list2.add("orange");
            list2.add("grape");

            List<String> joinedList = new ArrayList<>(list1);
            joinedList.addAll(list2);

            System.out.println("List 1: " + list1);
            System.out.println("List 2: " + list2);
            System.out.println("Joined List: " + joinedList);
        }
    }


