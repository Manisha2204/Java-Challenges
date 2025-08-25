import java.util.Scanner;

//find the longest word in the sentence
public class Day7 {
    public static void main(String[] args) {
        //take the sentence input from the user
        Scanner sc = new Scanner(System.in);
        String sentence  = sc.nextLine();
        // store the words of the sentence by spliting the spaces
        String[] words = sentence.split(" ");
        // take a longest word empty string
        String longestword = "";
        //take loop for comparing
        for (String word:words){
            if(word.length() > longestword.length()){//if the present word length is
                //greater than the longest word length
                // replace longest word with that word
                longestword = word;
            }
        }
        //once iterating all the words is done print the final longest word
        System.out.println("Longest word is : "+longestword);
    }


}
