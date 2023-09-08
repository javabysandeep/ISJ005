package controlStatements.conditional;

public class Demo3 {
    public static void main(String[] args) {
        //1. direct true false
        //2. expression :4 < 3
        //3. variable
        //4. function or method call
        boolean execute = false;
        if(isEmpty()){
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }

        System.out.println(4);
        System.out.println(5);
    }
    public static boolean isEmpty(){
        return false;
    }
}
