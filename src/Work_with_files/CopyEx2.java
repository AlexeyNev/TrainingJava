package Work_with_files;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream =
                     new FileInputStream("C:\\Users\\Алексей\\Desktop\\Marsik.jpg");
             FileOutputStream outputStream =
                     new FileOutputStream("Marsik.jpg");

        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}