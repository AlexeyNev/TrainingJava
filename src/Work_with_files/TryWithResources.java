package Work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai1 = " четверостишие; форма лирической поэзии, \n" +
                " широко распространённая на Ближнем и Среднем Востоке (наравне с газелью и касыдой).\n";

        String rubai2 = " Истоки лежат в устном народном творчестве иранцев и таджиков.\n";

        try (FileWriter writer = new FileWriter("test.txt", true)) {

            writer.write(rubai1);
            writer.write(rubai2);

            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
