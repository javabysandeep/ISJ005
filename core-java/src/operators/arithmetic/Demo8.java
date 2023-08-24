package operators.arithmetic;

public class Demo8 {
    public static void main(String[] args) {
        int a = 100;//direct value
        int b = 10 * 10; // expression
        int c = 200;
        int d = c; //another variable
        int sum = add(10,20); // method call
        //System.out.println(100=300);

        System.out.println(a);//100
        System.out.println(b);//100
        System.out.println(c);//200
        System.out.println(d); //200
        System.out.println(sum);//30
    }

    public static int add(int a, int b){
        return a+b;
    }
}
