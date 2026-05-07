import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> flowers = new HashSet<>();

        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Sunflower");
        flowers.add("Rose"); 

        System.out.println(flowers);
    }
}
