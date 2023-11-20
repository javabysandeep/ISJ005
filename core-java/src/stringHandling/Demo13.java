package stringHandling;

public class Demo13 {
    public static void main(String[] args) {
        String commaSeparatedValues = "Abhishek,Vaibhav,Sarika,Pratiksha,Ritik,Swapnil,Hrushikesh";
        String[] splitStings = commaSeparatedValues.split(",");
        StringBuilder result = new StringBuilder();
        for (String temp : splitStings) {
            if (temp.startsWith("S")) {
                result.append(temp + ",");
                System.out.println(System.identityHashCode(result));
            }
        }
        System.out.println(result);
    }
}
