import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Milon");
        names.add("Jibon");
        names.add("Noyon");
        names.add("Milon");

        System.out.println(names);
    }
}
