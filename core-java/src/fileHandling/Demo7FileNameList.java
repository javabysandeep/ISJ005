package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo7FileNameList {
    public static void main(String[] args) throws IOException {
        File folder = new File("src\\array");
        String[] fileNameList = folder.list();//list of file names
        for (String fileName : fileNameList) {
            System.out.println(fileName);
        }
    }
}
