package Work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25); //создали буфер на 25 байт
            StringBuilder stix = new StringBuilder();

            int byteRead = channel.read(buffer);//первый раз прочитали информацию из файла и записали в буфер
            while (byteRead > 0) { //кол-во байт прочитанных > 0 ?
                System.out.println("Read " + byteRead);//выводим на экран сколько прочитали байт

                buffer.flip();//переводим буфер в режим чтения

                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());//читаем информацию из буфера и присоеденияем ее к нашему StringBuilder stix по одному байту
                }

                buffer.clear();//переводим позицию на нулевую ячейку, то есть в начало
                byteRead = channel.read(buffer);//читаем информацию из файла и записываем ее в буфер
            }
            System.out.println(stix);


            /**
             * Первый вариант записи в файл
             * text.getBytes().length перевод текста в массив байтов
             */
              String text = "\nThere are only two ways to live your life.";
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            /**
             * Второй вариант записи в файл
             * text.getBytes() перевод текста в массив байтов
             * wrap() записывает информацию сразу в буфер из текста переведенного в массив байтов
             */
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
