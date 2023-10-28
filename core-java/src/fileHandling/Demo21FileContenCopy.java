package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo21FileContenCopy {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src\\fileHandling\\Demo10FileList.java");
        File outputFile = new File("abc.txt");

        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        int read = fileInputStream.read();
        while (read != -1) {
            fileOutputStream.write((char) read);
            read = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("File Copy operation complete");

    }
}
