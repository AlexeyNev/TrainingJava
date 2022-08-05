package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    /* public static void main(String[] args) throws FileNotFoundException {
        readFile();
    } */  //обработать исключение можно либо так

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } //либо так

    public static void readFile() throws FileNotFoundException {
        File file = new File("");
        Scanner scanner = new Scanner(file);
    }
}
