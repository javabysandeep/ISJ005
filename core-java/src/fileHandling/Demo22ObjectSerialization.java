package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo22ObjectSerialization {
    public static void main(String[] args) throws IOException {
        File file = new File("student_data.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Student student = new Student(1, "xyz", "abc", "pass");
        objectOutputStream.writeObject(student);
        System.out.println("Object written successfully");
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
