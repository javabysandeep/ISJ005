package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo5FileMetaData {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("File length " + file.length());
        System.out.println("Absolute path of the File  " + file.getAbsolutePath());
        System.out.println("Can we write to a file "+file.canWrite());
    }
}
