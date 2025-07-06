# 🔢 Prefix Sum Array & Range [L, R] Query – Java

This program demonstrates how to:
- Build a *Prefix Sum Array* from a given array
- Use it to find the *sum of elements from index L to R* in O(1) time

---

## 🧠 Problem Statement

Given an array of integers arr[] and a range [L, R], find the sum of elements from index L to R.

---

## ✨ Sample Input & Output

*Input Array:*  
arr = [2, 4, 6, 8, 10]

*Prefix Sum Array:*  
prefix = [2, 6, 12, 20, 30]

*Query:*  
Find sum from index L = 1 to R = 3  
✅ *Output:* 18 (Because 4 + 6 + 8 = 18)

---

## 🧮 Algorithm

1. Create a prefix sum array:
   - prefix[0] = arr[0]
   - prefix[i] = prefix[i-1] + arr[i]
2. To find sum of range [L, R]:
   - If L == 0: return prefix[R]
   - Else: return prefix[R] - prefix[L - 1]

---

## 💻 Java Code

See [Find PrefixSum.java](./PrefixSum.java)

---

## 🕒 Time & Space Complexity

| Task                     | Complexity |
|--------------------------|------------|
| Build Prefix Array       | O(n)       |
| Query sum from L to R    | O(1) ✅     |
| Space for prefix[]       | O(n)       |

---

## 📌 Notes

- Ideal for multiple queries on static arrays
- Common technique used in competitive programming and interviews

---

## ✅ Tags

#DSA #PrefixSum #RangeQuery #Java #O1Queries
