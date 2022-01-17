package javaExD;

public class CylinderTest {
    public static void main(String[] args) {
        // 객체 생성
        Cylinder c = new Cylinder();

        // 속성 값 입력
        c.radius = 4;
        c.height = 5;

        // 출력
        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
    }
}

class Cylinder {
    /* 필드와 메소드를 구현하시오. */
    int radius;
    int height;

    // 부피 구하는 메서드
    public double getVolume() {
        return (this.radius * this.radius * Math.PI) * this.height;
    }

    public double getArea() {
        double num = this.radius * this.radius * Math.PI;
        double num1 = this.radius * this.height * Math.PI * 2;
        return (num1 * 2) + num;
    }
}