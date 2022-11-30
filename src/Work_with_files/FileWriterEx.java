package Work_with_files;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Запись данных в пустой файл с помощью потока(стрима)
 */

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai1 = " четверостишие; форма лирической поэзии, \n" +
                " широко распространённая на Ближнем и Среднем Востоке (наравне с газелью и касыдой).\n";

        String rubai2 = " Истоки лежат в устном народном творчестве иранцев и таджиков.\n";

        FileWriter writer = null;
        try {
            writer = new FileWriter("test.txt", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
              writer.write(rubai1); // альтернативное заполнение файла без цикла

//              writer.write(s); // если так сделать - файл рубаи перезапишется. нужно добавить true в new FileWriter

                writer.write(rubai2);

            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
