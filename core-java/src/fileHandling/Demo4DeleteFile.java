package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo4DeleteFile {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            File file = new File("file_handling_temp_files\\" + i + ".txt");
            System.out.println("File is deleted..." + file.delete());
        }

    }
}
