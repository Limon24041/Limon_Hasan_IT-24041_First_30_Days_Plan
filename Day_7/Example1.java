class Outer {
    int num = 5;

    class Inner {
        void show() {
            System.out.println("Number is: " + num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}
