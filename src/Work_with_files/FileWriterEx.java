package Work_with_files;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Запись данных в пустой файл с помощью потока(стрима)
 */

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = " четверостишие; форма лирической поэзии, \n" +
                " широко распространённая на Ближнем и Среднем Востоке (наравне с газелью и касыдой).\n" +
                " Истоки лежат в устном народном творчестве иранцев и таджиков.\n";

        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Алексей\\Desktop\\test1.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
