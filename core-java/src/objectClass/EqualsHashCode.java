package objectClass;

import java.util.Objects;

public class EqualsHashCode {


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

            @Override
            public boolean equals(Object object) {
                if (object == null) {
                    return false;
                }
                if (object == this) {
                    return true;
                }
                Student student = (Student) object;
                return student.getId() == this.getId();
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }
        }

        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() + "\t" + student2.hashCode());
    }
}
