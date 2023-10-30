package objectClass;

public class Demo2EqualsMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false --> reference check
        System.out.println(10 == 20);//false
    }
}
