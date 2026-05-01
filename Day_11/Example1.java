import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Milon");
        students.put(102, "Jibon");
        students.put(103, "Noyon");

        System.out.println(students.get(102));
        System.out.println(students);
    }
}
