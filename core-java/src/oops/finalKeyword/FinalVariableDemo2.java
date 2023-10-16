package oops.finalKeyword;

public class FinalVariableDemo2 {
    public static void main(String[] args) {
        class Student {
            final int id;
            final String name;

            //1. initialize the instance variables immediately
            //2. initialize the instance variables in the constructor
            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

        }

        Student student = new Student(1,"abc");
        //student.id = 100; //instance variables are final
//        student.name = "xyz";//instance variables are final

    }
}
