// find the missing element in the array
//approach:
//1. we know expected sum = n*n+1/2
//2. missing num = expected sum - actual sum

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the last element for the array
        System.out.print("Enter the last number that you want in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];//store the size less than the actual size
        System.out.println("Enter the "+(n-1)+" elements in the array: ");
        for (int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }

        //find the expected sum
        int expsum = (n*(n+1))/2;

        //find the actual sum
        int actualsum =0;
        for(int num:arr){
            actualsum+=num;
        }

        System.out.println("The missing number is : "+(expsum-actualsum));

    }
}