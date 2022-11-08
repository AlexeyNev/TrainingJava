package Lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(carSupplier.get());
        }
        return a;
    }

    public static void ChangeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "blue", 2.0));
        System.out.println("Our Cars " + ourCars);

        ChangeCar(ourCars.get(0),
                car -> {
            car.color = "red";
            car.engine = 2.5;
            car.model = "Almera";
            System.out.println("Upgraded car: " + car);
        });
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}