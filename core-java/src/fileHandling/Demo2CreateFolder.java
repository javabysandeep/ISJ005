package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2CreateFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("file_handling_temp_files");
        System.out.println("Folder is created..." + folder.mkdir());
    }
}
