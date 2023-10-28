package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo18WriteToBufferInCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("using BufferedWriter we can write strings easily");

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("File write operation successfully");
    }
}
