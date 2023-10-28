package fileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo13ReadFromBufferInBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\array\\Demo10MaximumElement.java");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int element = bufferedInputStream.read();
        while (element != -1) {
            System.out.print((char) element);
            element = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();

    }
}
