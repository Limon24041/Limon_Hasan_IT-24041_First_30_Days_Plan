import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Study");
        tasks.add("Practice");
        tasks.add("Assignment");

        System.out.println("Tasks: " + tasks);

        tasks.remove("Practice");

        System.out.println("After removing: " + tasks);
    }
}
