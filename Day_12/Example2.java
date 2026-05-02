import java.util.ArrayList;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Example2 {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(1, "Mobile"));
        list.add(new Product(2, "Fan"));
        list.add(new Product(3, "Fridge"));
        list.add(new Product(4, "Television"));
        list.add(new Product(5, "Laptop"));

        for (Product p : list) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
