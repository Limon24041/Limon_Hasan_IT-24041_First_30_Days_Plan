import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<String> printJobs = new LinkedList<>();

        printJobs.add("File.pdf");
        printJobs.add("Image.jpg");
        printJobs.add("Report.docx");

        System.out.println(printJobs.remove());
        System.out.println(printJobs.peek());
        System.out.println(printJobs);
    }
}
