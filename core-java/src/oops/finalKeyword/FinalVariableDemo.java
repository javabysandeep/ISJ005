package oops.finalKeyword;

public class FinalVariableDemo {
    public static void main(String[] args) {
        final int a;
        a = 100;
        //a = 200;//final variables value cannot be changed
        //System.out.println(a);//200

        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        final Student student = new Student(1, "Sachin");
        student.id = 100;
        student.name = "Sachin T";
       // student = new Student(2,"Ganesh");
        System.out.println(student.id + "\t" + student.name);
    }
}
