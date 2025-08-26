import java.util.Scanner;

//find the maximum and minimum element in the array
public class Day8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        //take the array input
        int[] arr = new int[size];
        //enter the elements
        System.out.print("Enter the "+size+" elements : ");
        //run loop from 0 to arr length->size
        for (int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }

        //let suppose the max and min element is the first element in the array
        int max = arr[0];
        int min = arr[0];
        //run loop through the array and swap if found a element greater than max
        //and swap if found a element smaller than min
        // we will run loop from the second element that is i=1
        //so that the time to check the first element we can skip as its already intialized
        for (int i=1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        //print the maximum and minimum once all the iterstions and swapping is done
        System.out.println("The maximum element in the array is: "+max);
        System.out.println("The minimum element in the array is: "+min);

    }


}
