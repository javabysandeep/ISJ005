package fileHandling;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    String username;
    transient String password;

    public Student() {
    }

    public Student(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
