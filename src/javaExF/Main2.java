package javaExF;

public class Main2 {
    public static void main (String[] args) {
        // 객체 생성
        Car c = new Car("티코");
        Car t = new Truck("봉고", 1.5);

        // 정보 출력
        System.out.println(c.toString());
        System.out.println(t.toString());
    }
}

class Car {
    protected final String name;

    public Car(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("[자동차] { name: %s }", name);
    }
}

class Truck extends Car {
    protected final double ton; // 적재량

    public Truck(String name, double ton) {
        super(name); // 부모의 생성자 호출
        this.ton = ton;
    }

    @Override
    public String toString() {
        return String.format("[트럭] { name: %s, ton: %.1f }", super.name, this.ton);
    }
}
