package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo16WriteToBufferInBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write('B');

        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("File write operation successfully");
    }
}
