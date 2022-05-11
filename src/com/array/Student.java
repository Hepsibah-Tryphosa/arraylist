
package com.array;

public class Student {

    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int getNumOfMarks() {
        int numOfSub = marks.length;
        return numOfSub;
    }

    int getTotalSumOfMarks() {
        int sum = 0;
        int i = 0;
        for (i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        // System.out.println(sum);
        return sum;

    }

    // 11, 12, 40, 14, 15, 26
    int getMaxNumOfMarks() {
        int maximum = 0;
        int i = 0;
        for (i = 0; i < marks.length; i++) {
            if (marks[i] > maximum) {
                maximum = marks[i];

            }

        }
        return maximum;
    }

    // 11, 12, 40, 14, 15, 26
    int getMinimumMarks() {
        int minimum = Integer.MAX_VALUE;    //2147483647;
        int i = 0;
        for (i = 0; i < marks.length; i++) {
            if (marks[i] < minimum) {
                minimum = marks[i];
            }
        }
        return minimum;
    }
 int getAvgMarks() {
     int sum= getTotalSumOfMarks();
     int number=getNumOfMarks();
     int average =(sum/number);
     




    return average;
}










}