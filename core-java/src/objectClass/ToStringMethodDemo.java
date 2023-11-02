package objectClass;

public class ToStringMethodDemo {


    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }


        }
        Student student = new Student(1, "abc");
        System.out.println(student.getClass().getName() + "@" + Integer.toHexString(student.hashCode()));
        System.out.println(student.toString());
        System.out.println(student);
    }
}
