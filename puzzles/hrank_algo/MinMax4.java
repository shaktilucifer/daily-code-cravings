import java.io.*;
import java.util.*;

class MinMax {
 public void printMinMax(int[] arr) {
  Arrays.sort(arr);
  long min = 0;
  long max = 0;
  for (int i = 0; i < 5; i++) {
   if (i > 0) {
    max += arr[i];
   }
   if (i < 4) {
    min += arr[i];
   }
  }
  System.out.print(min + " " + max);
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int[] arr = new int[] {
   1,
   2,
   3,
   4,
   5
  };
  MinMax mm = new MinMax();
  mm.printMinMax(arr);
 }
}
// Sample Input

// 1 2 3 4 5
// Sample Output

// 10 14

// Output Format

// Print two space-separated long integers denoting the respective minimum and maximum values that can be 
// calculated by summing exactly four of the five integers. 
//     (The output can be greater than 32 bit integer.)
