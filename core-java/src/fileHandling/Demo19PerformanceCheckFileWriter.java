package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo19PerformanceCheckFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file);
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000000; i++) {
            fileWriter.write("IT Shaala " + i);
        }
        long endTime = System.currentTimeMillis();
        fileWriter.close();
        System.out.println("Time taken to write " + (endTime - startTime));
    }
}
