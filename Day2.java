import java.util.Scanner;

// Check a String is a Palindrome or not
public class Day2 {
    public static void main(String[] args) {
        // take input from the user
        Scanner sc = new Scanner(System.in);
        //convert the input into lowercase
        String input = sc.nextLine().toLowerCase();
        //now take a empty reverse string
        String reverse = "";
        // run a loop from length to 0;
        for (int i=input.length()-1;i>=0;i--){
            //store the characters one by one in the reverse string
            reverse += input.charAt(i);
        }
        //now compare your input with the reverse
        //if same palindrome
        //else not a palindrome
        if (input.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

}
