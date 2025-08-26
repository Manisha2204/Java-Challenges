import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//find the maximum and minimum element in the array
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //sort the arrays
        Arrays.sort(arr);
        System.out.println("The maximum element in the array is: "+arr[size-1]);
        System.out.println("The minimum element in the array is: "+arr[0]);
    }
}
