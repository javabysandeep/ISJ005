package exceptionHandling;

public class Demo32 {
    public static void main(String[] args) {
        try {
            return;
        }catch (Exception e){
            return;
        }
        finally {
            System.out.println("finally");
        }
        //System.out.println("rest of the statements");
    }
}
