package stringHandling;

import java.util.StringTokenizer;

public class Demo10 {
    public static void main(String[] args) {
        String commaSeparatedValues = "Abhishek,Vaibhav,Sarika,Pratiksha,Ritik,Swapnil,Hrushikesh";
        String[] splitStings = commaSeparatedValues.split(",");
        for (String temp : splitStings) {
            System.out.println(temp);
        }
        //System.out.println(commaSeparatedValues.reverse());
    }
}
