//check the strings are anagram or not
// anagram-> strings having same characters and frequency


import java.util.*;

public class Day6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take first String input
        System.out.print("Enter your first String: ");
        //convert into lower cases and remove spaces
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s+","");
        System.out.print("Enter your second String: ");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s+","");
        //check whether the length is equal or not
        if(str1.length()!=str2.length()){
            System.out.println("Not an Anagram");
            return;//stops the process here itself
        }
        //when the lengths are equal
        //store strings in the array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //sort both the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //compare both the arrays
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }

    }

}