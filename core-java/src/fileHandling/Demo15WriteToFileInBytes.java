package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo15WriteToFileInBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write('A');
        fileOutputStream.close();
        System.out.println("File write operation successfully");
    }
}
