class BankAccount {
    private int balance = 0;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }
}
public class Test {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(500);

        System.out.println(acc.getBalance());
    }
}
