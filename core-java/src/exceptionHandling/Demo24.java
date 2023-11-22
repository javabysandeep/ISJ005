package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class Demo24 {
    public static void main(String[] args) {
        File file = new File("xyz.txt");
        try {
            System.out.println("File is created..."+file.createNewFile());
        } catch (IOException e) {
            System.out.println("Exception occured");
        }
    }
}
