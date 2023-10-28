package fileHandling;

import java.io.*;

public class Demo23ObjectDeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student_data.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);

        objectInputStream.close();
        fileInputStream.close();
    }
}
