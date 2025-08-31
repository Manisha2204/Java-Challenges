import java.util.Scanner;

// factorial of the number
public class Day13 {

    //factorial function
    public static long factorial(long n){
        //base case
        if(n==1){
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the number from the user
        System.out.print("The number is : ");
        long n = sc.nextLong();
        System.out.println("The factorial of "+n+" is: "+factorial(n));

    }
    }
