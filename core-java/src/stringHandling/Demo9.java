package stringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String str = "welcome to String handling session";
        System.out.println(str.indexOf("session"));

        System.out.println(str.startsWith("welcome"));//true
        System.out.println(str.startsWith("Welcome"));//true
        System.out.println(str.endsWith("session"));//true
        System.out.println(str.endsWith("Session"));//true
    }
}
