package array;

public class Demo3AccessingArrayElements {
    public static void main(String[] args) {
        int[] values = new int[5];
        System.out.println(values[0]);//0
        System.out.println(values[1]);//0
        System.out.println(values[2]);//0
        System.out.println(values[3]);//0
        System.out.println(values[4]);//0
        System.out.println(values[5]);//RTE :ArrayIndexOutOfBoundsException
        //index range : min = 0 and max = arrayLength-1
    }
}
