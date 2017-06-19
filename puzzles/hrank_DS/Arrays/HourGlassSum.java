import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlassSu, {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxHourglassSum = -99999;
        for(int i=1; i < 5; i++){
            for(int j=1; j < 5; j++){
                int subSum = arr[i][j] + 
                    arr[i-1][j-1]+arr[i-1][j] + arr[i-1][j+1]
                    +arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                if(maxHourglassSum < subSum){
                    maxHourglassSum = subSum;
                }
               
            }
        }
        System.out.println(maxHourglassSum);
    }
}
// Output Format

// Print the largest (maximum) hourglass sum found in .

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19
