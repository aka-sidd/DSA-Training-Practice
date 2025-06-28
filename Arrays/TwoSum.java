import java.util.*;
public class TwoSum {
  //Function to return indicesof the two numbers such that they add up to target
  public static int[] twoSum(int[] nums,int target) {
    HashMap<Integer, Integer> map = new HashMap<>(); // value -> index
  for(int i = 0; i<nums.length;i++) {
    int complement = target - nums[i];

    //Check if the complement exist in map
    if(map.containsKey(complement)) {
      return new int[] {map.get(complements),i};
    }
    //Add the current element to the map
    map.put(nums[i],i);
  }
    //If no solution found
  return new int[] {};
  }
  //Driver Code
  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;

  int[] result = twoSum(nums,target);

  if(result.length==2) {
    System.out.println("Indices: "+ result[0] + "," + result[1]);
  } else {
    System.out.println("No valid pair found..");
  }
  }
}
