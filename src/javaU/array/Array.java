package javaU.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;
        System.out.println(Arrays.toString(marks));

        Person[] persons = new Person[5];
        System.out.println(Arrays.toString(persons));

        int[] nums = new int[5];
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums, 100);
        System.out.println(Arrays.toString(nums));

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.equals(array1, array2));
        int[] array3 = {3,2,3};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}

class Person {
}
