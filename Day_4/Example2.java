class Vehicle {
    String brand = "R15";
}

class Car extends Vehicle {
    void show() {
        System.out.println(brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }
}
