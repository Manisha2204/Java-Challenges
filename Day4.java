import java.util.Scanner;

// find the first non recurring character in the string
public class Day4{
    public static void main(String[] args) {
        //take string input from the user
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //take a boolean variable found
        boolean found = false;//if found the charcter then true;
        // run a loop for the charcters in the string
        for (int i=0; i<=input.length()-1; i++){
            char ch = input.charAt(i);
            // take another boolean variable isrepeating
            boolean isrepeating = false;//if repeating character found then true
            //run another loop to compare ch with other charcters of the string
            for (int j=0; j<=input.length()-1;j++){
                if(i!=j && input.charAt(j)==ch){
                    //means the repeating charcter of ch is found
                    isrepeating = true;
                    break;
                }
            }
            // if dont find any repeating character of ch then
            // come out of the inner loop
            if(!isrepeating){
                //isrepeating = false
                System.out.println("The first non repeating character is : "+ch);
                // make is found as true as we found the charcter
                found = true;
                break;//so that it doesnot go for any other charcter check further
            }
        }
        //after iterating all the charcters if not found any non recurring charcter then
        if(!found){
            //found -> false
            System.out.println("There is no non recurring charcter in the string.");
        }
    }
}