package test.lessons.iostream;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        InputStream inStream = new FileInputStream("/home/igorbanza/Downloads/Hello nigga!.txt");
        OutputStream outStream = new FileOutputStream("/home/igorbanza/Downloads/Hello nigga!.txt");

        while (inStream.available() > 0) {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.

        }
        inStream.close(); //закрываем потоки
        outStream.close();
    }
}
