class Calculator {
    int a, b;

    void setValues(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.setValues(5, 3);

        System.out.println("Sum = " + c.add());
    }
}
