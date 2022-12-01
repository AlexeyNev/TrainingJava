package Work_with_files.programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        List<String> list;
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("list1.bin")
        )
                ) {
            list = (ArrayList)inputStream.readObject();
            System.out.println(list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
