package javaU.arrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;

        for (int num : marks) {
            sum += num;
        }
        return sum;
    }

    public int getMaximumMark() {
        int max = Integer.MIN_VALUE;

        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public int getMinimumMark() {
        int min = Integer.MAX_VALUE;

        for (int mark : marks) {
            if(mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int num = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
    }
}
