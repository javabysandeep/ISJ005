package objectClass;

public class GarbageDemo {
    public static void main(String[] args) {
        class Student {
            @Override
            public void finalize() throws Throwable {
                System.out.println("finalize method of Student class");
            }
        }
        Student student = new Student();
        student = null;
        System.gc();

    }
}
