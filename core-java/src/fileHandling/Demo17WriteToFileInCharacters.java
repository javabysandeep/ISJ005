package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo17WriteToFileInCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("using FilerWriter we can write strings easily");

        fileWriter.close();
        System.out.println("File write operation successfully");
    }
}
