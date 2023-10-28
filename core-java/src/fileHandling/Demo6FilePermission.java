package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo6FilePermission {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.setWritable(false);
        System.out.println("File permission set to read only");
    }
}
