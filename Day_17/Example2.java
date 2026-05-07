class Director {

    String name;

    Director(String n) {
        name = n;
    }

    void display() {
        System.out.println("Director Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Director d1 = new Director("Jibon");

        d1.display();
    }
}
