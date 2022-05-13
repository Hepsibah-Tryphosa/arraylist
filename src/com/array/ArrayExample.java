package com.array;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] arg) {
        ArrayList<Integer> marksList = new ArrayList<>();
        int[] marks = { 11, 12, 40, 14, 15, 26 };
        marksList.add(11);
        marksList.add(12);
        marksList.add(40);
        marksList.add(14);
        marksList.add(15);
        marksList.add(26);
        // length,accessing,updating
        int length = marksList.size();
        System.out.println(length);

        for (int i = 0; i < marksList.size(); i++) {
            System.out.println(marks[i]);             // array
            Integer mark = marksList.get(i);          // arraylist
            System.out.println(mark);

        }

        Integer markThree = marksList.get(2);
        markThree = 50;
        marksList.set(2, markThree);
        marksList.add(100);
        marksList.remove(1);
        marksList.clear();

        length = marksList.size();
        System.out.println(length);
        

        for (Integer number : marksList) {
            System.out.println(number);
        }

    }

}
