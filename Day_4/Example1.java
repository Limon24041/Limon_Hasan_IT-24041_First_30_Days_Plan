class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cow extends Animal {
    void sound2() {
        System.out.println("Cow moos");
    }
}

public class Main {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.sound();
        c.sound2();
    }
}
