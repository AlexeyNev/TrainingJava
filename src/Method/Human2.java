package Method;

public class Human2 {
    String name;
    Car5 car;
    BankAcc bankAcc;

    void inf() {
        System.out.println(
                "Имя " + name + " " + "Машина " + car.color + " " + "Банковский счет " + bankAcc.summa
        );
    }
}

class Car5 {
    Car5(String c,int n) {
        color = c;
        number = n;
    }
    String color;
    int number;
}

class BankAcc {
    BankAcc(double s) {
        summa = s;
    }
    double summa;
}

class Human2Test {
    public static void main(String[] args) {
        Human2 human2 = new Human2();
        human2.name = "Petr";
        human2.car = new Car5("white", 434);
        human2.bankAcc = new BankAcc(1000.0);
        human2.inf();
    }
}