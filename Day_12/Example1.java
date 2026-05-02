import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Milon");
        students.add("Jibon");
        students.add("Noyon");

        for (String s : students) {
            System.out.println(s);
        }
    }
}
