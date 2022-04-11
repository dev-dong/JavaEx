package javaU.arrayList;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Ranga", 97, 98, 100);
        Student student1 = new Student("Adam", 97, 98);

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
