class Student {
    String name;
    int id;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Limon Hasan";
        s1.id = 24041;

        s1.display();
    }
}
