# JAVA-ASSESSMENT-4
## REGISTER NAME :- 212221240029
## NAME :- MONISHA T
### 1) Write a Java program to join two array lists.
### PROGRAM :-

```java
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
    
```

### OUTPUT :-

<img width="286" alt="image" src="https://user-images.githubusercontent.com/93427240/229197945-a5c996c7-4a42-40fd-88b7-5f9d82c9040a.png">

### 2) Write a Java program to retrieve but does not remove, the first element of a linked list. 
### PROGRAM :-

```java

package PROGRAM_2;

import java.util.LinkedList;
public class RETRIVE {
        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("Java");
            linkedList.add("Python");
            linkedList.add("C++");
            String firstElement = linkedList.peekFirst();
            System.out.println("First Element: " + firstElement);
        }
    }
    
```
### OUTPUT :-

<img width="287" alt="image" src="https://user-images.githubusercontent.com/93427240/229198986-926d13b2-4cfb-4c12-b5e2-befb77748885.png">

### 3) Write a Java program to check if a particular element exists in a linked list. 
### PROGRAM :-

```java

package PROGRAM_3;

import java.util.LinkedList;
public class EXSIST {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("apple");
            list.add("banana");
            list.add("cherry");
            list.add("date");
            list.add("elderberry");
            String elementToCheck = "ELDERBERRY";
            if (list.contains(elementToCheck)) {
                System.out.println("The element '" + elementToCheck + "' exists in the LinkedList");
            } else {
                System.out.println("The element '" + elementToCheck + "' does not exist in the LinkedList");
            }
        }
    }


```

### OUTPUT :-

<img width="361" alt="image" src="https://user-images.githubusercontent.com/93427240/229199892-ef4499c2-2414-45b3-ba17-225fc9fd217e.png">

### 4) Write a Java program to remove all of the elements from a hash set.
### PROGRAM :-

```java
package PROGRAM_4;

import java.util.HashSet;
public class REMOVE {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            set.clear();
            System.out.println("Size of HashSet after removing all elements: " + set.size());
        }
    }


```

### OUTPUT :-

<img width="290" alt="image" src="https://user-images.githubusercontent.com/93427240/229200439-603224a4-9c3b-4c0e-be47-ac20a577d67a.png">

### 5) Write a Java program to compare two hash set
### PROGRAM :-

```java
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


```
### OUTPUT :-

<img width="279" alt="image" src="https://user-images.githubusercontent.com/93427240/229201118-f1eb7a8a-8bf4-413a-89ef-3d0ec1cb7c60.png">

### 6) .Write a Java program to retrieve and remove the last element of a tree set
### PROGRAM :-

```java

package PROGRAM_6;
import java.util.TreeSet;
public class RETRIVEINHAST {
        public static void main(String[] args) {
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("apple");
            treeSet.add("banana");
            treeSet.add("orange");
            String lastElement = treeSet.pollLast();
            System.out.println("Original TreeSet: " + treeSet);
            System.out.println("Last Element Removed: " + lastElement);
            System.out.println("Updated TreeSet: " + treeSet);
        }
    }


```
### output :-

<img width="280" alt="image" src="https://user-images.githubusercontent.com/93427240/229202042-97667190-fbb2-4b22-a7ce-cf70a19ea1c6.png">

### 7) Write a Java program to convert a Priority Queue elements to a string representation.
### PROGRAM :-

```java
package PROGRAM_7;

import java.util.PriorityQueue;
public class PRIORITY {
        public static void main(String[] args) {
            PriorityQueue<String> queue = new PriorityQueue<>();
            queue.add("apple");
            queue.add("banana");
            queue.add("pear");
            queue.add("orange");
            String queueAsString = queue.toString();
            System.out.println("Queue as string: " + queueAsString);
        }
    }


```
### OUTPUT :-

<img width="341" alt="image" src="https://user-images.githubusercontent.com/93427240/229204496-4a003911-e3fc-4d44-8d9d-8024d0111149.png">

### 8) Write a Java program to get a collection view of the values contained in this map.  
### PROGRAM :-
```java

package PROGRAM_8;

import java.util.*;
public class COLLECTION {
        public static void main(String[] args) {
            Map<String, String> myMap = new HashMap<>();
            myMap.put("key1", "value1");
            myMap.put("key2", "value2");
            myMap.put("key3", "value3");
            Collection<String> values = myMap.values();
            for (String value : values) {
                System.out.println(value);
            }
        }
    }
    
```
### OUTPUT :-

<img width="288" alt="image" src="https://user-images.githubusercontent.com/93427240/229207027-facedb88-1975-4166-ab6a-bf1f93732b1f.png">

### 9) Write a Java program to get a set view of the keys contained in this map
### PROGRAM :-

```java 
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


```

### OUTPUT :-

<img width="287" alt="image" src="https://user-images.githubusercontent.com/93427240/229207622-d1bd1be4-6bb1-4c76-b32a-07b7bbea93b1.png">

### 10) Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key. 
### PROGRAM :-

```java

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


```

### OUTPUT :-
<img width="292" alt="image" src="https://user-images.githubusercontent.com/93427240/229208565-dc179b5e-1491-4957-94cb-d053fdc43ac1.png">

### 11) Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.

### PROGRAM :-

```java

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


```

### OUTPUT :-

<img width="290" alt="image" src="https://user-images.githubusercontent.com/93427240/229209179-18b1681f-cd59-4686-b883-45b084156093.png">

