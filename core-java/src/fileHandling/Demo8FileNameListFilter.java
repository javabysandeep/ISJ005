package fileHandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo8FileNameListFilter {
    public static void main(String[] args) throws IOException {
        File folder = new File("src\\array");
        FilenameFilter filenameFilter = (dir, fileName) -> fileName.startsWith("Demo1");
        String[] fileList = folder.list(filenameFilter);//file name list
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
    }
}
