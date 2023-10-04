package classComponents.constructor;

public class Student {
    int id;
    String name;

    Student() {
        id = 10;
        name = "abc";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        Student student6 = new Student(1,"Sachin");

        System.out.println(student.id + "\t" + student.name);
    }
}
