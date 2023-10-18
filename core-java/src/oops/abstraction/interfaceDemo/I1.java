package oops.abstraction.interfaceDemo;

public interface I1 {
    //variable : by default variables are public static final
    public static final int variable = 10;

    //method : by default methods are public abstract
    //void instanceMethod(){} // instance methods are not allowed
    public abstract void m1();//

    //constructor : not allowed
    //MessageService(){}

    //blocks : not allowed
    //{}
    //static {}

    //nested classes : by default nested classes are : public static
    public static class Nested {}
}
