public class Car {
    String color;

    public Car(String c) {
        color = c;
    }

    public void show() {
        System.out.println(color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Red");
        Car c2 = new Car("Blue");

        c1.show();
        c2.show();
    }
}
