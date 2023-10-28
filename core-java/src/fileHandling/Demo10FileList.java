package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo10FileList {
    public static void main(String[] args) throws IOException {
        File folder = new File("src\\array");
        File[] fileObjectList = folder.listFiles();//list of file object
        for (File file : fileObjectList) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }
    }
}
