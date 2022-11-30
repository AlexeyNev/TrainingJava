package Work_with_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Чтобы поток закрывался автоматически - нужно перенести создание new FileReader
 * в блок try() - try (FileReader reader = new FileReader("test.txt"))
 * теперь поток в конце своей работы закроется автоматически
 */

public class FileReaderEx {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("test.txt");
             FileWriter writer = new FileWriter("test.txt", true);) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
