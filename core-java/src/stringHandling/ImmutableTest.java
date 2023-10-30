package stringHandling;

public class ImmutableTest {
    public static void main(String[] args) {
        Student student = new Student(1,"abc");
        System.out.println(student.hashCode());
        System.out.println(student.toString());

    }
}
