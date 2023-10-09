package classComponents.nestedClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        class Local {
            int a = 10;
            // static int b = 10;

            void m1() {
                System.out.println("m1");
            }

            /* static void m2(){
                 System.out.println("m1");
             }*/ {
                System.out.println("instance block");
            }

            /*static {
                System.out.println("static block");
            }*/
            /*static class B{}*/
            class B {
            }
        }
        Local local = new Local();
        System.out.println(local.a);
        local.m1();


    }
}
