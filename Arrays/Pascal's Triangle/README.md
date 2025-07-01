# Pascal's Triangle

## 🔍 Problem Statement

Given an integer numRows, generate the first numRows of Pascal's Triangle.

In Pascal's Triangle:
- Each number is the sum of the two numbers directly above it.
- The triangle starts with [1] at the top.

## 🧠 Logic / Approach

- Each row starts and ends with 1.
- For each element not at the edge:

***triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]***


- Use a List<List<Integer>> to build the triangle row by row.

## 📈 Time and Space Complexity

- *Time Complexity:* O(numRows²)  
Because there are numRows rows, and the i-th row has i elements → total ~ n² operations.

- *Space Complexity:* O(numRows²)  
We store the whole triangle as a 2D list.

## ✅ Example

### Input:
```java
numRows = 5


##Output
[
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
]



