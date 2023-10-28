package fileHandling;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Demo9FileList {
    public static void main(String[] args) throws IOException {
        File folder = new File("src\\array");
        FileFilter filter = (file) -> file.length() > 800;
        File[] fileObjectList = folder.listFiles(filter);//list of file object
        for (File file : fileObjectList) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }
    }
}
