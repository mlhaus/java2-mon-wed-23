package com.hauschildt.demo.day6;

import com.hauschildt.demo.day2.BankAccount;

import java.util.*;

import static com.hauschildt.demo.day6.MyCollections.printCollection;

public class MutableLists {
    private static List<BankAccount> myList3;

    public static void main(String[] args) {
        // .asList() returns a List which is an interface, 
        // The add method is unsupported because it is abstract and has no implementation
//        myList3 = Arrays.asList(new BankAccount(100)); 
        myList3 = new ArrayList<>(Arrays.asList(new BankAccount(100)));
        myList3.add(new BankAccount(200)); // add method is supported because ArrayList is a class
        printCollection(myList3, "vertical");
    }
}
