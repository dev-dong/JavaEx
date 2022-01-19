package javaExE;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        // 객체 생성
        LottoMachine machine = new LottoMachine();

        // 번호 생성
        int[] arr = machine.generate();

        // 결과 출력
        System.out.print("생성 번호: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

class LottoMachine {
    // 필드
    private ArrayList<Integer> numbers;

    // 생성자
    public LottoMachine() {
        numbers = new ArrayList<Integer>();

        /* 1. 번호(1 ~ 45)를 추가하세요. */
        for(int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
    }

    // 메소드
    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random rand = new Random();

        /* 2. 임의의 숫자 6개를 추출하세요. */
        System.out.println("numbers.size() : " + numbers.size());
        for(int i = 0; i < pickedNumbers.length; i++) {
            // 중복제거. remove(Object o) - 해당 객체의 값을 찾아서 제거한다.
            pickedNumbers[i] = numbers.remove(rand.nextInt(numbers.size()));
        }

        return pickedNumbers;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}