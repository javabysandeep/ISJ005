package classComponents.variables;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.id);
        System.out.println(student1.name);


        student1.id = 101;
        student1.name = "Sachin";

        System.out.println(student1);//reference : classComponents.variables.Student@65ab7765
        System.out.println(student1.id);
        System.out.println(student1.name);
    }

}
