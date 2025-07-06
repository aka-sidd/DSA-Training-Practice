Ques1:) Given an array of Integer,print the frequency of each element.
Input: arr=[1,2,2,3,3,3]
o/p: 1->1
    2->2
    3->3

//Solution(Code)

import java.util.HashMap;
public class FrequencyOfElement {
public static void main(String[] args) {
   int[]arr = {1,2,2,3,3,3};
HashMap<Integer, Integer> map = new HashMap<>();

for(int num : arr) {
map.put(num, getOrDefault(num,0)+1);
}

 //Print frequencies
   for(int key:map.keySet()) {
   System.out.println(key+"->"+mp.get(key));
}
}
}
