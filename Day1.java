
// reverse the string without the string builder
public class Day1 {
    public static void main(String[] args) {
        // take input using the Scanner class
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // take the character of the input using charAt()
        // print each character one by one in reverse order
        for (int i=input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            System.out.print(ch);
        }
    }

}
