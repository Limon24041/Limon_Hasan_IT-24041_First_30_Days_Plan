class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cow();
        a.sound();
    }
}
