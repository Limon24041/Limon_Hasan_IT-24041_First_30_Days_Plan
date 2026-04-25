class Test {
    void display() {

        class Inner {
            void msg() {
                System.out.println("Hello from inner class");
            }
        }

        Inner i = new Inner();
        i.msg();
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
