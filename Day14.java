//tower of hanoi
//-> You have 3 rods:
// A-> Source, B->Auxillary(helping rod), C-> Destination
// n disks are arranged on rod A in decresing size(largest at bottom and smallest at the top)
// we need to shift all the disks in the same order as in rod A to rod C, performing one step and moving one disk at a time

// We must follow some rules:
// 1. Only one disk can be moved at a time.
// 2. You cannot place a larger disk on top of a smaller disk
// 3. All disk must be moved from Source A -> Destination C using Auxillary B



import java.util.Scanner;

public class Day14 {


    //create solve function
    public static void solve(int n,char source,char auxillary,char destination){
        //if you want to count the number of moves
        //take a counter to track
        //create a base case
        if(n==1){//in case there is only one disk we can move it directly
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;//stop the process here
        }

        // if we have more then one disk then
        //when n=2
        // Disks={2,1}
        // Steps:
        // 1. Move disk 1 from A to B
        solve(n-1,source,destination,auxillary);
        // 2. Move disk 2 from A to C(since remained with only 1 disk)
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        //3. Move disk 1 from B to C
        solve(n-1,auxillary,source,destination);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the number of disks
        System.out.print(" Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("Sequence of Moves: ");
        // use a function(solve)
        //call the solve function with name of source,aux,dest
        solve(n,'A','B','C');
    }
}
