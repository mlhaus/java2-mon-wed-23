package com.hauschildt.demo.day6;

import com.hauschildt.demo.day2.BankAccount;

import java.util.*;
import java.util.stream.Collectors;

public class MyCollections {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
//        List<String> myList = new LinkedList<>();
//        List<String> myList = new Stack<>();

        myList.add("cat");
        myList.add("dog");
        myList.add(1, "rabbit");
        myList.addAll(Arrays.asList("Cat", "Rabbit", "Dog"));
        myList.addAll(3, Arrays.asList("CAT", "RABBIT", "DOG"));
        printCollection(myList, "horizontal");

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(100));
        accounts.add(new BankAccount(200));
        accounts.add(new BankAccount(300));
        accounts.add(new BankAccount(400));
        printCollection(accounts, "vertical");

        Queue<Integer> queue1 = new PriorityQueue<>();

        Set<Double> set1 = new HashSet<>();
//        Set<Double> set1 = new LinkedHashSet<>();
//        Set<Double> set1 = new TreeSet<>();

        Map<String, Integer> map1 = new HashMap<>();
//        Map<String, Integer> map1 = new TreeMap<>();
//        Map<String, Integer> map1 = new Hashtable<>();

        Shape shape = new Circle(1);
        Shape shape2 = new Rectangle(4);
    }

    public static void printCollection(Collection<? extends Object> collection, String direction) {
        if(direction.equalsIgnoreCase("vertical")) {
            // Advanced for loop (aka: for-each loop)
//            for(var el: collection) { // el stands for element, java will declare the data type during run time
//                System.out.println(el);
//            }

            // Use the .forEach() method from the Collection class with a lambda expression
//            collection.forEach((el) -> System.out.println(el));

            // Use the .forEach() method from the Collection class with a method reference
            collection.forEach(System.out::println);
        } else {
//            System.out.println(collection);
            // Doesn't print brackets, but prints a comma at the end
//            for(var el: collection) {
//                System.out.print(el + ", ");
//            }
//            System.out.println();
            
            // Use streams to not print brackets
            System.out.println(collection.stream().map(Object::toString).collect(Collectors.joining(",")));
            
        }
    }
}
