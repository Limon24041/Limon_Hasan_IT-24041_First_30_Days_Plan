class Student {
    String name;
    int id;
}

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Limon Hasan";
        student1.id = 24041;

        System.out.println(student1.name + "\n" + student1.id);
    }
}
