public class Student {
    String name;

    public Student() {
        name = "Milon";
    }

    public void show() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
