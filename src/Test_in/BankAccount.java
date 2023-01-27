package Test_in;

import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
    String name;
    private double balance;
    private final long accNum = ThreadLocalRandom.current().nextLong(100000000, 999999999);

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        System.out.println("HELLO " + name + ", Your account number is: " + accNum);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addFunds(int amount) {
        this.balance += amount;
    }
    public void withdrawFunds(int amount) {
        this.balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public long getAcctNum() {
        return accNum;
    }

    public void transfer(BankAccount name, double amount) {
        if(this.balance >= amount) {
            name.balance += amount;
            this.balance -= amount;
            System.out.println("Transaction Successful");
        }
        else {
            System.err.println("Insufficient Funds!");
        }
    }
}

class BankSimulator {
    static BankAccount John = new BankAccount("John", 50000);
    static BankAccount James = new BankAccount("James", 3000);

    public static void main(String[] args) {
        John.transfer(James, 300);
        System.out.println("John's new balance is "+ John.getBalance());
        System.out.println("James' new balance is "+ James.getBalance());
    }
}
