import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        String search = "Mango";

        if (fruits.contains(search)) {
            System.out.println(search + " is available.");
        } else {
            System.out.println(search + " is not available.");
        }
    }
}
