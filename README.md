# 🚀 Java Coding Challenge

Welcome to my **Java Coding Challenge** repository! 🎯
This is a personal journey where I solve **Java coding problems daily** to strengthen my problem-solving skills, practice clean code, and prepare for coding interviews.

Each day, I’ll be uploading a new Java program with:

* 📌 Problem statement
* 🖥️ Code solution
* ✅ Sample input/output

This challenge is **continuous**  — a way to **stay consistent with coding** and share my progress publicly.

---

## ✅ Problems Solved

### **Day 1 – String Reversal**

* **Challenge:** Reverse a string in Java without using `StringBuilder.reverse()`.
* **Approach:**

  * Took input with `Scanner`
  * Traversed string in reverse order
  * Printed each character one by one
* **Sample Run:**

  ```
  Input: my name is java  
  Output: avaj si eman ym
  ```

---

### **Day 2 – Palindrome Checker**

* **Challenge:** Check if a given string is a palindrome (same forwards & backwards) without using `StringBuilder.reverse()`.
* **Approach:**

  * Took input with `Scanner`
  * Converted string to lowercase
  * Built a reversed string manually using a loop
  * Compared original and reversed strings
* **Sample Run:**

  ```
  Input: mom  
  Output: Palindrome  

  Input: hello  
  Output: Not a Palindrome
  ```

---

### **Day 3 – Count Vowels, Consonants, Digits, and Spaces**

* **Challenge:** Count the number of vowels, consonants, digits, and spaces in a given string.
* **Approach:**

  * Converted string to lowercase
  * Checked each character using conditions
  * Maintained separate counters for vowels, consonants, digits, and spaces
* **Sample Run:**

  ```
  Input: Java 17 is Interesting!  
  Output:  
  Vowels: 7 
  Consonants: 10
  Digits: 2  
  Spaces: 3  
  ```

---
### **Day 4 – First Non-Repeating Character**

* **Challenge:** Find the first non-repeating character in a string.

* **Approach:**

* Traversed string character by character

* For each character, checked if it repeats elsewhere

* Printed the first character that does not repeat

* If none found, displayed a message

* **Sample Run:**

  ```
  Input: swiss  
  Output: FIrst non-repeating character: w 
   Input: mamama 
  Output: No non-repeating character found
   ```

---
---
### **Day 5 – Build Your Own substring() Function**

* **Challenge:** Implement a custom substring() method in Java without using the built-in one.

* **Approach:**

* Took user input string and start/end indexes with Scanner

* Checked for invalid indexes (negative, greater than length, or start > end)

* Traversed the string character by character from start to end - 1

* Built the result manually and returned it as substring

* **Sample Run:**

  ```
  Input: JavaProgramming
  Start: 4
  End: 11
  Output: Program 
   ```

---
### **Day 6– Anagram Checker**

* **Challenge:** Check if two strings are anagrams (contain the same characters with the same frequency, arranged differently).

* **Approach:**

* Took two string inputs using Scanner.

* Converted both strings to lowercase and removed spaces.

* Checked if their lengths were equal (quick rejection if not).

* Converted both strings into character arrays.

* Sorted both arrays and compared them using Arrays.equals().

* **Sample Run:**

  ```
  Input:
  Enter your first String: listen
  Enter your second String: silent
  Output: Anagram 
   ```
---
### **Day 7– Longest Word in a Sentence**

* **Challenge:** Find the longest word in a given sentence.

* **Approach:**

* Took user input sentence with Scanner.

* Split the sentence into words using .split(" ").

* Initialized an empty string longestWord.

* Traversed each word, compared lengths, and updated the longest.

* Printed the longest word at the end.

* **Sample Run:**

  ```
  Input: I love solving coding problems daily
  Output: problems
   ```
---
### **Day 8 – Find Maximum & Minimum in an Array**

💻 **Challenge:** Write a Java program to find the maximum and minimum element in an array.

---

### **Approach 1 – Iteration (Efficient `O(n)` method)**

* Took input with Scanner
* Assumed first element as both `max` and `min`
* Traversed array from index `1` to `n-1`
* Compared each element with `max` and `min`, updated accordingly

**Sample Run:**

```
Input: 10 5 88 2 65  
Output:  
The maximum element in the array is: 88  
The minimum element in the array is: 2  
```

---

### **Approach 2 – Using Arrays.sort() (Simpler `O(n log n)` method)**

* Took input with Scanner
* Used `Arrays.sort()` to sort the array
* Picked `arr[0]` as `min` and `arr[size-1]` as `max`

**Sample Run:**

```
Input: 10 5 88 2 65  
Output:  
The maximum element in the array is: 88  
The minimum element in the array is: 2  
```

---

### **Day 9 – Array Rotation (Left & Right)**

* **Challenge:** Rotate the elements of an array `k` times in either left or right direction.

* **Approach:**

  * Took array input from the user
  * Applied the **Reversal Algorithm** for rotation

    * Right Rotation:

      1. Reverse entire array
      2. Reverse first `k` elements
      3. Reverse remaining elements
    * Left Rotation:

      1. Reverse first `k` elements
      2. Reverse remaining elements
      3. Reverse entire array
  * Printed the rotated array

* **Sample Run (Right Rotation):**

  ```
  Input:
  Enter the size of the array: 5
  Enter the elements in the array: 1 2 3 4 5
  Enter the number of rotation: 3
  Enter the type of rotation(left/right): right

  Output:
  Original Array: 1 2 3 4 5
  Array after right rotation 3 times is: [3, 4, 5, 1, 2]
  ```

* **Sample Run (Left Rotation):**

  ```
  Input:
  Enter the size of the array: 5
  Enter the elements in the array: 1 2 3 4 5
  Enter the number of rotation: 2
  Enter the type of rotation(left/right): left

  Output:
  Original Array: 1 2 3 4 5
  Array after left rotation 2 times is: [3, 4, 5, 1, 2]
  ```

---

### **Day 10 – Find Duplicate Elements in an Array**

* **Challenge:** Find all duplicate elements in an array.

* **Approach:**

  * Used a **HashSet** `seen` to store visited elements
  * If `seen.add(num)` returns `false`, element is duplicate → store in another set `duplicate`
  * Printed all duplicates

* **Sample Run:**

  ```
  Input:
  Enter the size of the array: 10
  Enter the elements: 5 3 8 2 5 9 3 7 1 8

  Output:
  Duplicate elements are: [5, 3, 8]
  ```

---

### **Day 11 – Find the Missing Number in an Array**

* **Challenge:** Find the missing element in a sequence of numbers.

* **Approach:**

  * Formula for expected sum of first `n` natural numbers: `n*(n+1)/2`
  * Calculated actual sum of given elements
  * Missing number = Expected sum – Actual sum

* **Sample Run:**

  ```
  Input:
  Enter the last number that you want in the array : 5
  Enter the 4 elements in the array:
  1 2 4 5

  Output:
  The missing number is : 3
  ```

---
Here’s the **Day 12 content** written in the same format as your previous ones 👇

---

### **Day 12 – Binary Search using Recursion**

* **Challenge:** Implement Binary Search in Java using recursion.

* **Approach:**

  * Took array input from user
  * Sorted the array using `Arrays.sort()`
  * Defined a recursive function `binarysearch(arr, low, high, target)`
  * Compared middle element with target:

    * If equal → return index
    * If target < mid → search left subarray
    * If target > mid → search right subarray
  * Base case: if `low > high`, return -1 (not found)

* **Sample Run:**

  ```
  Size of array: 5
  Array elements are: 10 3 6 8 2
  Target element : 6

  The target element 6 is found at index: 3
  ```

---

### **Day 13 – Factorial using Recursion**

* **Challenge:** Implement Factorial calculation in Java using recursion.

* **Approach:**

  * Took a number input from the user.
  * Defined a recursive function `factorial(n)`:

    * Base case → if `n == 0` or `n == 1`, return `1`.
    * Recursive case → return `n * factorial(n - 1)`.
  * Printed the result.

* **Sample Run:**

  ```
  Enter a number: 5

  Factorial of 5 is: 120
  ```

---

### **Day 14 – Tower of Hanoi**

* **Challenge:** Solve the Tower of Hanoi problem using recursion.

* **Approach:**

  * Took number of disks as input from the user.
  * Defined a recursive function `solve(n, source, auxiliary, destination)`:

    * **Base case** → if `n == 1`, move the disk directly from source to destination.
    * **Recursive case** →

      1. Move `n-1` disks from **source → auxiliary**.
      2. Move the `nth` disk from **source → destination**.
      3. Move `n-1` disks from **auxiliary → destination**.
  * Printed the sequence of moves step by step.

* **Sample Run:**

  ```
  Enter number of disks: 3

  Sequence of Moves: 
  Move disk 1 from A to C
  Move disk 2 from A to B
  Move disk 1 from C to B
  Move disk 3 from A to C
  Move disk 1 from B to A
  Move disk 2 from B to C
  Move disk 1 from A to C
  ```

---

✨ More challenges coming soon!
📂 Each solution is available in this repository with code and sample test cases.

---


