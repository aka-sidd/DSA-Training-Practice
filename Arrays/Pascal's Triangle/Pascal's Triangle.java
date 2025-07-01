import java.util.*;
public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

  for(int i = 0; i < numRows; i++) {
    List<Integer> row = new ArrayList<>();

    for(int j = 0; j <= i; j++) {
      //First and last elements in every row are 1
    if(j == 0 || j == i) {
      row.add(1);
    } else {
      //others value are sum of elements from the row above
      int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
      row.add(value);
    }
    }
    triangle.add(row);
  }
  return triangle;
  }
  public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        int numRows = 5;
        List<List<Integer>> result = pt.generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
