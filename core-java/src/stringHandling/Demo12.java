package stringHandling;

public class Demo12 {
    public static void main(String[] args) {
        String commaSeparatedValues = "Abhishek,Vaibhav,Sarika,Pratiksha,Ritik,Swapnil,Hrushikesh";
        String[] splitStings = commaSeparatedValues.split(",");
        String result = "";
        for (String temp : splitStings) {
            if (temp.startsWith("S")) {
                result = result + temp+",";
                System.out.println(System.identityHashCode(result));
            }
        }
        System.out.println(result);
    }
}
