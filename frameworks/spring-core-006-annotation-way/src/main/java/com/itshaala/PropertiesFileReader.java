package com.itshaala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PropertiesFileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/application.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        int content = fileInputStream.read();
        while (content!=-1){
            System.out.print((char)content);
            content = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
