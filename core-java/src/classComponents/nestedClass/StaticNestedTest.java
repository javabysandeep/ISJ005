package classComponents.nestedClass;

public class StaticNestedTest {
    public static void main(String[] args) {
        System.out.println("static variable " + StaticOuter.staticOuterVariable);
        StaticOuter.staticOuterMethod();

        //accessing static members of static nested class :
        // OuterClass.StaticNestedClass.staticMember
        System.out.println(StaticOuter.StaticNested.a);
        StaticOuter.StaticNested.m1();


        StaticOuter.StaticNested reference = new StaticOuter.StaticNested();
        System.out.println("Instance variable " + reference.b);
        reference.m2();
    }
}
