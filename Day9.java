import java.util.Arrays;
import java.util.Scanner;

// rotate the elements by k
// ex: rotate the elements by k times in right direction/left direction
//elements: 1 2 3 4 5
// right-> 3 4 5 1 2
// 1 2 3 4 5
//1. 5 4 3 2 1
//2. upto 3 elements reverse(k->3), 3 4 5 2 1
//3. reverse the remaining elements after 3, 3 4 5 1 2
// left-> 4 5 1 2 3
public class Day9{

    //rotation function
    public static void rotate(int[] arr, int k , String direction){
        // take the size
        int n = arr.length;//n->5
        //if k>n
        k = k%n;//k->3

        //check the rotation(left/right)
        //rotation-> right
        if (direction.equalsIgnoreCase("right")){//right
            //1. reverse all the numbers
            reverse(arr,0,n-1); //reverse(arr,0,4)
            //2. reverse upto  k elements
            reverse(arr,0,k-1);
            //3. reverse the remaining elements
            reverse(arr,k,n-1);
        }
        //rotation-> left
        if(direction.equalsIgnoreCase("left")){// 1 2 3 4 5
            //1. reverse upto k elements
            reverse(arr,0,k-1);// 3 2 1 4 5
            //2. reverse the remaining elements from k
            reverse(arr,k,n-1);// 3 2 1 5 4
            //3. reverse all the elements
            reverse(arr,0,n-1);//4 5 1 2 3
        }
    }


    //reverse function
    public static void reverse(int[] arr, int start, int end){// arr,0,4
        //check start and end
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //increment start to move forward
            start++;
            //decrement  end to move backward
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the size of the array
        System.out.print("Enter the size of the array: "); //5
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements in the array: "); //1 2 3 4 5
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        //take the number of rotation
        System.out.print("Enter the number of rotation: "); //3
        int k = sc.nextInt();

        //enter the rotation type
        System.out.print("Enter the type of rotation(left/right): "); //right
        String direction = sc.next();

        //print the original array
        System.out.print("Original Array: ");// 1 2 3 4 5
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //call the rotation function
        rotate(arr,k,direction);//call this
        // print the array after rotation
        System.out.println("Array after "+direction+" rotation "+k+" times is: "+ Arrays.toString(arr));

    }

}