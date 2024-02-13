package com.itshaala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/application.properties");

        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        System.out.println("Course ID : "+properties.get("courseId"));
        System.out.println("Course Name : "+properties.get("courseName"));
        System.out.println("Course Content : "+properties.get("courseContent"));

    }
}
