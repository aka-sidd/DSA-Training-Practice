## 🧮 Two Sum (Using HashMap)

*Problem:*  
Given an array of integers nums and an integer target, return the *indices* of the two numbers such that they add up to the target.

*Approach:*  
Used a HashMap to store the values and their indices.  
Checked for the complement (target - current number) while traversing the array.

*Time Complexity:* O(n)  
*Space Complexity:* O(n)

*Example:*  
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1] (because 2 + 7 = 9)
