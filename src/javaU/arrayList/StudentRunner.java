package javaU.arrayList;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Ranga", 97, 98, 100);

        int number = student.getNumberOfMarks();
        System.out.println(number);

        int sum = student.getTotalSumOfMarks();
        System.out.println(sum);

        int maximumMark = student.getMaximumMark();
        System.out.println(maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println(minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println(average);

        student.addNewMark(35);
        System.out.println(student.toString());
        System.out.println(student.getMarks());

        student.removeMarkAtIndex(1);
        System.out.println(student.toString());
    }
}
