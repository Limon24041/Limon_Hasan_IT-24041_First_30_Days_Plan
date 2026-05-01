import java.util.LinkedList;

public class TaskList {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Wake up");
        tasks.add("Pray");
        tasks.add("Study");
        tasks.add("Practice Java");

        tasks.addFirst("Start Day");
        tasks.addLast("Sleep");

        System.out.println(tasks);
    }
}
