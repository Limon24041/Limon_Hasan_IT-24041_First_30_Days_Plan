class Director {

    String name = "Milon";

    void show() {
        System.out.println("Managing Director: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Director d = new Director();

        d.show();
    }
}
