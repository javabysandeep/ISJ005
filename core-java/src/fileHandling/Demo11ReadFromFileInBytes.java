package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo11ReadFromFileInBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\array\\Demo10MaximumElement.java");
        FileInputStream fileInputStream = new FileInputStream(file);
        int element = fileInputStream.read();
        while (element!=-1){
            System.out.print((char)element);
            element = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
