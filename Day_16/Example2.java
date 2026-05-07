import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("data.txt");

            String text = "Hello Java";

            byte[] b = text.getBytes();

            fout.write(b);

            fout.close();

            System.out.println("File written successfully");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
