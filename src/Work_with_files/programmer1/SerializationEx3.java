package Work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx3 {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee("Marya", "IT", 25, 300, new Car("Honda", "white"));
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
