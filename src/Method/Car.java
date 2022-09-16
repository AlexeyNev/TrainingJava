package Method;

public class Car {
    Car(String cvet, String motor) {
        color = cvet;
        engine = motor;

        System.out.println("Цвет " + color + " " + "Мотор машины " + engine);
    }

    String color;
    String engine;


}

class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Black", "2.0");
        Car car1 = new Car("White", "1.6");

    }
}
