package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo14ReadFromBufferInCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\array\\Demo10MaximumElement.java");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int element = bufferedReader.read();
        while (element != -1) {
            System.out.print((char) element);
            element = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
