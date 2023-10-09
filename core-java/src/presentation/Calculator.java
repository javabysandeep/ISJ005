package presentation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first No. - ");
        int input1=sc.nextInt();
        System.out.println("Enter Operator - ");
        char operator=sc.next().charAt(0);
        System.out.println("Enter Second No. - ");
        int input2=sc.nextInt();
        switch(operator)
        {
            case '+':
                System.out.println("Addition"+ "\t"+(input1+input2));break;
            case '-':
                System.out.println("Substraction"+ "\t" +(input1-input2));break;
            case '*':
                System.out.println("Addition"+(input1*input2));break;
            case '/':
                System.out.println("Addition"+(input1/input2));break;
            default:
                System.out.println("Enter valid Input");
        }


    }
}
