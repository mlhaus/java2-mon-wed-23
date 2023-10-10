package com.hauschildt.demo.day6;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz6 {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("bread");
        groceryList.add("eggs");
        groceryList.add("bread");

//        Incorrect Response
//        for (int i = 0; i < groceryList.size(); i++) {
//            String str = groceryList.get(i);
//
//            if (str.equals("bread")) {
//                groceryList.remove(str);
//            }
//        }


//        Iterator<String> it = groceryList.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            if (str.equals("bread"))
//                groceryList.remove(str);
//        }

//        Incorrect Response
        Iterator<String> it = groceryList.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("bread"))
                it.remove();
        }

//        Incorrect Response
        ArrayList<String> groceryListCopy = new ArrayList(groceryList);

        for (String str: groceryListCopy) {
            if (str.equals("bread"))
                groceryList.remove(str);
        }


        for (int i = groceryList.size() - 1; i >= 0 ; i--) {
            String str = groceryList.get(i);

            if (str.equals("bread")) {
                groceryList.remove(str);
            }
        }


//        for (String str: groceryList) {
//            if (str.equals("bread"))
//                groceryList.remove(str);
//        }

        groceryList.forEach(System.out::println);
    }
}
