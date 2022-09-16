package Method;

public class Car {
    String color;
    String engine;
    int speed;

    int gaz(int a) {
        speed += a;
        return speed;
    }

    int tormoz(int a) {
        speed -= a;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет машины " + color + " " + "Двигатель " + engine + " " + "Скорость " + speed);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine = "V8";
        car.color = "red";
        car.speed = 70;

        car.showInfo();
        car.gaz(20);
        car.showInfo();
    }
}
