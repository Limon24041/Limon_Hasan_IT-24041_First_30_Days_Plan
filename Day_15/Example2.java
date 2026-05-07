import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("flower.txt");

            String name = "Rose";

            byte[] b = name.getBytes();

            fout.write(b);

            fout.close();

            System.out.println("Data written");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
