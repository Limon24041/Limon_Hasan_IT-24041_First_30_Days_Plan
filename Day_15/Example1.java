import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("flower.txt");

            int i;

            while((i = fin.read()) != -1) {
                System.out.print((char)i);
            }

            fin.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
