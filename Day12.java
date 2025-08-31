import java.util.Arrays;
import java.util.Scanner;

// binary search using recursion
public class Day12 {

    //binary function
    public static int binarysearch(int[] arr, int low, int high, int target){
        //take the mid
        int mid = (low+high)/2;
        //base case
        if (low>high){
            return -1;//element not found
        }

        if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            //element is there in the left side of the mid
            return binarysearch(arr,low,mid-1,target);
        }
        else {
            return binarysearch(arr,mid+1,high,target);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take the size of the array
        System.out.print("Size of array: ");
        int size = sc.nextInt();

        //take the array elements
        int[] arr = new int[size];
        System.out.print("Array elements are: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //sort the array elements
        Arrays.sort(arr);


        //take target from the user
        System.out.print("Target element : ");
        int target = sc.nextInt();

        //take low and high indexes
        int low = 0;
        int high = size;
        System.out.println(high);

        //lets make a binary function

        int result  = binarysearch(arr,0,size-1,target);

        if(result==-1){
            System.out.println("Element not found :(");
        }else {
            System.out.println("The target element "+target+" is found at index: "+(result+1));//so instead of starting the index count from 0 it will start from 1

        }
    }
}