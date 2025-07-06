public class EquilibriumIndex {
  static int findEquilibriumIndex(int[] arr) {
    int totalSum = 0;
    for(int num: arr) {
      totalSum+=num;

    int leftSum = 0;
      for(int i = 0; i < arr.length; i++) {
        int rightSum = totalSum - leftSum - arr[i];
        if(leftSum == rightSum) {
          return i;
          leftSum += arr[i];
        }
        return -1; // No Equilibrium Index Found
      }
      //Main method
    public static void main(String[] args) {
      int[] arr = {1,7,3,6,5,6};
      int index = findEquilibriumIndex(arr);
      System.out.println("Equilibrium Index" + index);
    }
    }
