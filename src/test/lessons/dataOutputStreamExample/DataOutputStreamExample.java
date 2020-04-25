package test.lessons.dataOutputStreamExample;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputStreamExample {

        public static void main(String[] args) throws IOException {

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("/home/igorbanza/Downloads/testFile.txt"));

            dos.writeUTF("SomeString");
            dos.writeInt(22);
            dos.writeDouble(1.21323);
            dos.writeBoolean(true);

        }
    }

