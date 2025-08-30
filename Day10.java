import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// find the duplicate elements in the array
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the array size
        System.out.print("Enter the size of the array: ");//10
        int size = sc.nextInt();
        //take the array elements
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");// 5 3 8 2 5 9 3 7 1 8
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //take a seen hash set to store the traversed elements
        Set<Integer> seen = new HashSet<>();
        //take another hash set named duplicate to store the duplicate elements
        Set<Integer> duplicate = new HashSet<>();

        //run the loop to traverse the elements
        for (int num : arr) {
            //if any new elements comes add in the seen
            //seen ={}
            // seen.add(5) -> seen ={5} -> true
            // seen.add(3) -> seen ={5,3} -> true
            // seen.add(8) -> seen ={5,3,8} ->true
            // seen.add(2) -> seen ={5,3,8,2} -> true
            // seen.add(5) -> seen = {5,3,8,2} -> already 5 is there it will return false
            // add in the duplicate , duplicate.add(5) -> duplicate ={5}
            // seen.add(9) -> seen = {5,3,8,2,9} ->true
            // seen.add(3) -> seen = {5,3,8,2,9} ->false , duplicate.add(3) -> duplicate ={5,3}
            // seen.add(7) -> seen = {5,3,8,2,9,7} ->true
            // seen.add(1) -> seen = {5,3,8,2,9,1} ->true
            // seen.add(8) -> seen = {5,3,8,2,9} ->false , duplicate.add(8) -> duplicate ={5,3,8}

            if (!seen.add(num)) {//already present in the seen set add to duplicate
                duplicate.add(num);
            }
        }


        //Now, check the duplicate
        if (duplicate.isEmpty()) {
            System.out.println("Duplicates not found!:(");
        } else {
            System.out.println("Duplicate elements are: " + duplicate);
        }

    }
}