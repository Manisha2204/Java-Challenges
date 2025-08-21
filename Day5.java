import java.util.Scanner;

//make your own substring function
public class Day5{


    //make a substring function
    public static String substring(String input,int start, int end){
        //define a empty result string
        String result = "";
        //check the start and end indexes
        if(start<0 || end>input.length() || start>end){
            System.out.println("Invalid Indexes");
        }else{
            //run the loop from start to end and store in the result
            for (int i=start;i<=end-1;i++){
                result+=input.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //take input from the user
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        System.out.println("Substring: "+substring(input,start,end));
    }

}