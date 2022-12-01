package Work_with_files.programmer2;

import Work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx4 {
    public static void main(String[] args) {
        Employee employee;

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees.bin")
        )) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
