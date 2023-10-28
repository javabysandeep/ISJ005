package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo12ReadFromFileInCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\array\\Demo10MaximumElement.java");
        FileReader fileReader = new FileReader(file);
        int element = fileReader.read();
        while (element != -1) {
            System.out.print((char) element);
            element = fileReader.read();
        }
        fileReader.close();
    }
}
