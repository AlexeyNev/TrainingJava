package Work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * SerializationEx1 отправляет файл с листом сотрудников
 * SerializationEx2 его принимает и открывает
 */

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Alla");
        list.add("Marsic");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("list1.bin")
        )
        ) {
            outputStream.writeObject(list);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
