package com.hauschildt.demo.day7;

import java.util.ArrayList;
import java.util.Iterator;

public class Stuff {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("bread");
        groceryList.add("eggs");
        groceryList.add("bread");


//        ArrayList<String> groceryListCopy = new ArrayList(groceryList);
//
//        for (String str: groceryListCopy) {
//            if (str.equals("bread"))
//                groceryList.remove(str);
//        }
//        groceryList.forEach(System.out::println);
//        System.out.println();
//
//        for (int i = groceryList.size() - 1; i >= 0 ; i--) {
//            String str = groceryList.get(i);
//
//            if (str.equals("bread")) {
//                groceryList.remove(str);
//            }
//        }
//        groceryList.forEach(System.out::println);
//        System.out.println();
//
        Iterator<String> it = groceryList.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("bread"))
                it.remove();
        }
        groceryList.forEach(System.out:: println);
        System.out.println();

    }
}
