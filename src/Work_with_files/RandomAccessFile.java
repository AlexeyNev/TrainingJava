package Work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Класс RandomAccessFile - позволяет читать информацию из любого места файла и записывать информацию в любое место файла.
 */

public class RandomAccessFile {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file
                     = new java.io.RandomAccessFile("test10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);

            file.seek(13);
            String a1 = file.readLine();
            System.out.println(a1);

            long b = file.getFilePointer();
            System.out.println(b);

//            file.seek(0);
//            file.writeBytes("hello ");

            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
