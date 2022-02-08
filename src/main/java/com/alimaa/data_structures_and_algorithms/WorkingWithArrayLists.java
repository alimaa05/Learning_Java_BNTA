package com.alimaa.data_structures_and_algorithms;

import java.util.ArrayList;

public class WorkingWithArrayLists {
    public static void main(String[] args) {

// Lists can work with objects

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.forEach( e -> {
            System.out.println("e = " + e);
        });


        for (Object e : list){
            System.out.println("e = " + e);
        }

    }

    private static void extracted(){

    }


}

// list contains values which are elements hence the e for element

// List<Person> people = new <Person> --> preferred way


// Generic type
// <E> - element
// <T> - type
// <K> - key (for maps)
// <V> - value (for maps)
// <N> - number