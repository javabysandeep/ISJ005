package classComponents.constructor;

import classComponents.variables.Demo;

public class Demo1 {
    //what : it is a method
    //  which has same name as of class name,
    //  no return type,
    //  no access modifier

    //zero parameterized constructor -> developer
       Demo1() {
        System.out.println("zero parameterized");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();

    }

}
