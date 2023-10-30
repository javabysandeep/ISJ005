package objectClass;

import java.lang.reflect.Method;

public class Demo1GetClass {
    public static void main(String[] args) {
        A a = new A();
        Class<? extends A> reference = a.getClass();
        Method[] methods = reference.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println(a.getClass().getName());
    }
}
