package array;

public class Demo2 {
    public static void main(String[] args) {
        //values are not known in advance. knows only no. of elements be stored
        //size cannot be empty : CTE
        //size cannot be negative : NegativeArraySizeException
        //size cannot be other than byte, short, int, char : CTE

        int[] values = new int[5];
        //array is created with 5 values
        //all the values are initialized with default value zero
        // new int[5] : it's an object
        //values : reference variable
        //int[] : array type
        // every array creation is nothing but object creation
        //for every array there is an instance variable created called as length which maintains the size of an array
        System.out.println(values.length);
    }
}
