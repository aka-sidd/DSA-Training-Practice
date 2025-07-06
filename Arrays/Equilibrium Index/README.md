🧠 Approach
Calculate the total sum of the array.

Iterate through the array while maintaining a running leftSum.

For each index i, check:

  leftSum == totalSum - leftSum - arr[i]
  
If true, return index i as Equilibrium Index.


# ⚖ Equilibrium Index – Java

## 💡 Problem Statement

Given an array of integers, find the index i such that the sum of elements at lower indexes (0 to i-1) is equal to the sum of elements at higher indexes (i+1 to n-1).

An index that satisfies this property is called an *Equilibrium Index*.

--- 

## 🔢 Sample Input & Output

### 🔹 Input:
``java
arr = [1, 7, 3, 6, 5, 6]

## Output
Equilibrium Index : 3

🔍 Dry Run (Step-by-Step Table)
| Index (i) | arr\[i] | leftSum | rightSum (totalSum - leftSum - arr[i]) | Match? |
| --------- | ------- | ------- | ---------------------------------------- | ------ |
| 0         | 1       | 0       | 27                                       | ❌      |
| 1         | 7       | 1       | 20                                       | ❌      |
| 2         | 3       | 8       | 17                                       | ❌      |
| 3         | 6       | 11      | 11                                       | ✅      |
| 4         | 5       | 17      | 6                                        | ❌      |
| 5         | 6       | 22      | 0                                        | ❌      |

➡ ✅ Equilibrium Index Found at i = 3

⏱ Time & Space Complexity
Task	Complexity
Time	-> O(n)
Space ->	O(1)
