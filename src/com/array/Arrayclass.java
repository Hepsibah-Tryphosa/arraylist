
package com.array;

public class Arrayclass {

    public static void main(String[] args) {
        int[] marks = { 11, 12, 40, 14, 15, 26 };
        Student student = new Student("sweety", marks);

        int numOfMark = student.getNumOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximum = student.getMaxNumOfMarks();
        int minimum = student.getMinimumMarks();
        int average=student.getAvgMarks();
        System.out.println(numOfMark);
        System.out.println(sum);
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(average);

        
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        marks[0] = 20;
        System.out.println(marks[0]);

        sum = 0;
        sum = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        System.out.println(sum);

        sum = 0;
        sum = sum + marks[0];
        sum = sum + marks[1];
        sum = sum + marks[2];
        sum = sum + marks[3];
        sum = sum + marks[4];
        System.out.println(sum);

        int i = 0;
        sum = 0;
        sum = sum + marks[i];
        i++;
        sum = sum + marks[i];
        i++;
        sum = sum + marks[i];
        i++;
        sum = sum + marks[i];
        i++;
        sum = sum + marks[i];
        System.out.println(sum);

        i = 0;
        sum = 0;
        sum = sum + marks[i++];
        sum = sum + marks[i++];
        sum = sum + marks[i++];
        sum = sum + marks[i++];
        sum = sum + marks[i++];
        System.out.println(sum);

        sum = 0;
        for (i = 0; i < 5; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum);

    }

}