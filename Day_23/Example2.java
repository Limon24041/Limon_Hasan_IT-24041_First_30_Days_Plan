import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Dhaka");
        cities.add("Chittagong");

        cities.addFirst("Mymensingh");
        cities.addLast("Sylhet");

        System.out.println("Cities: " + cities);
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());
    }
}
