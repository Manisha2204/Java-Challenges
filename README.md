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

✨ More challenges coming soon!
📂 Each solution is available in this repository with code and sample test cases.

---


