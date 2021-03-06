import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int a[][] = new int[][]{
              {11, 2, 4 },
              { 4, 5, 6 },
              { 10, 8, -12},
        };
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for(int i=0; i < n; i++){
            sumDiag1 += a[i][i];
            sumDiag2 += a[i][(n-1) - i];
        }
        System.out.println(Math.abs(sumDiag1 - sumDiag2));
    }
}
// Sample Input

// 3
// 11 2 4
// 4 5 6
// 10 8 -12
// Sample Output

// 15
