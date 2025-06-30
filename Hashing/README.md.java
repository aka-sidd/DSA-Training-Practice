## 💡 Approach

### ✅ Brute Force:
- Use two nested loops to compare each pair.
- Time: O(n²)  
- Space: O(1)

### ✅ Optimized Approach (Using HashSet):
- Traverse the array and store each element in a HashSet.
- If an element already exists in the set → return true.
- If loop completes, return false.

- *Time Complexity:* O(n)  
- *Space Complexity:* O(n)

---
  ### Logic 💡
  1:) Use a HashSet
  2:) If any element already exist in the set, return true
  3:) Else add to Set


🔗 [View Problem on LeetCode](https://leetcode.com/problems/contains-duplicate/)
