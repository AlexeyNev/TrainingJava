package Method;

public class Human {
        String name;
        Car3 car;
        BankAccount bankAccount;

        void info() {
            System.out.println("Имя "
                    + name + " " + "Цвет машины "
                    + car.color + " " + "Баланс банковского счета "
                    + bankAccount.balance);
        }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Fedor";
        human.car = new Car3("Red", "V8");
        human.bankAccount = new BankAccount(15, 200.5);
        human.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}