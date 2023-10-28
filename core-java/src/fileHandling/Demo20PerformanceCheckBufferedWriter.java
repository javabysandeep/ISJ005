package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo20PerformanceCheckBufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000000; i++) {
            bufferedWriter.write("IT Shaala " + i);
        }
        long endTime = System.currentTimeMillis();

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Time taken to write " + (endTime - startTime));
    }
}
