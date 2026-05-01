import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    public static void main(String[] args) {
        Queue<String> people = new LinkedList<>();

        people.add("Limon");
        people.add("Jibon");
        people.add("Milon");

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);
    }
}
