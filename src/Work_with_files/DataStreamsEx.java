package Work_with_files;

import java.io.*;

/**
 *  Классы DataOutputStream для записи и DataInputStream для чтения примитивных типов данных
 */

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(
                     new FileInputStream("my_test.bin"));
             ) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1000000);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(123.456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
