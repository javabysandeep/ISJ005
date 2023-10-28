package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
        System.out.println("File is created..."+file.createNewFile());
    }
}
