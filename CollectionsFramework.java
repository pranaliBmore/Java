//Example of Collections Framework

import java.util.*;
public class CollectionsFramework {

    public static void main(String[] args) {

        // List

        System.out.println("*****List*****");
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println("List: " + l);
        System.out.println("Element at index 2: " + l.get(2));
        System.out.println("Index of element A: " + l.indexOf("A"));
        System.out.println("Size of list: " + l.size());
        System.out.println("Remove element A: " + l.remove("A"));
        System.out.println("List after removing A: " + l);

        // Set 

        System.out.println("\n*****Set*****");
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("Set: " +s);
        System.out.println("Size of set: " + s.size());
        System.out.println("Contains 2: " + s.contains(2));
        System.out.println("Remove element 1: " + s.remove(1));
        System.out.println("Set after removing 1: " +s);

        
    }
}