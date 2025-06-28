Problem: Frequency of an Element in an Array
Objective:
Given an array of integers, print the frequency(number of occurences) of every unique element in the array.
## Input:
# An integer array arr[] of size n

## Output
For each unique element in the array, print the element and its frequency in the format:
`element-> frequency`

📚 Sample Input and Output:
Input:arr[] = [1,2,2,3,3,3];
output: 
1->1
2->2
3->3

🚀 Approach:
Use a HashMap to store each element as a key and its frequency as the value.

Traverse the array once, update the frequency in the map.

Finally, iterate over the map and print each entry.

Time Complexity: O(n)
Space Complexity: O(n) (for storing frequency map)
