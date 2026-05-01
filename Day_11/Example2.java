import java.util.TreeMap;

public class StudentTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Noyon");
        students.put(101, "Milon");
        students.put(102, "Jibon");

        System.out.println(students.get(102));
        System.out.println(students);
    }
}
