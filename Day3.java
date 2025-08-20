import java.util.Scanner;

// count the vowels,consonants, digits and spaces in the string
public class Day3 {
    public static void main(String[] args) {
        //take string input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        //take 4 diffrent counters
        // vowel counter,consonant counter,digit counter,space counter
        int v_count = 0;
        int c_count = 0;
        int d_count = 0;
        int s_count = 0;
        //extract characters and start comparing
        for (int i = 0; i <= input.length() - 1; i++) {
            //store characters in ch
            char ch = input.charAt(i);
            //check the vowels and consonants
            if (ch >= 'a' && ch <= 'z') {//check the range whether its a alphabet or not
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {//checks vowels
                    v_count++;
                } else {//consonant
                    c_count++;
                }
            }
            //check whether a digit or not
            else if (ch >= '0' && ch <= '9') {
                d_count++;
            }
            //check whether a space or not
            else if (ch == ' ') {
                s_count++;
            }

        }
        System.out.println("Vowels: " + v_count);
        System.out.println("Consonants: " + c_count);
        System.out.println("Digits: " + d_count);
        System.out.println("Spaces: " + s_count);
    }
}
