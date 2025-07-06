import java.util.Scanner;
public class PrefixSum {
  static int[] findPrefixSum(int[]arr) {
    int[] prefix = new int[arr.length];
    prefix[0] = arr[0];
    for(int i = 1; i < arr.length; i++) {
      prefix[i] = prefix[i-1] + arr[i];
    }
    return prefix;
  }
  // Handle range [L,R]
public static int rangeSum(int[] prefix, int L, int R) {
  if(L == 0) {
    return prefix[R];
  } else {
    return prefix[R] - prefix[L-1];
  }
}
  // Main method
public static void main(String[] args) {
  Scanner sc = new Scannner(System.in);
  int[]arr = {2,4,6,8,10};
  int[] prefix = findPrefixSum(arr);
  System.out.print("Enter L: ");
  int L = sc.nextInt();
  System.out.print("Enter R: ");
  int R = sc.nextInt();

  int[] result = rangeSum(prefix, L,R);
  System.out.println("Sum from index " + L + "to" + R + " = " + result);
  sc.close();
}
}

  
