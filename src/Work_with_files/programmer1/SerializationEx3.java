package Work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx3 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "white");

        Employee employee1 =
                new Employee("Marya", "Petrova", "IT", 300, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees.bin")
        )) {
            outputStream.writeObject(employee1);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
