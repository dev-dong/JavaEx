package javaU.arrayList;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {99, 98, 72};

        Student student = new Student("Ranga", marks);

        int number = student.getNumberOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaximumMark();
        int minimumMark = student.getMinimumMark();
        BigDecimal average = student.getAverageMarks();

        System.out.println(number);
        System.out.println(sum);
        System.out.println(maximumMark);
        System.out.println(minimumMark);
        System.out.println(average);
    }
}
