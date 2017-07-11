// Sample Input

// 6
// 1 2 3 4 10 11
// Sample Output

// 31
import java.io.*;
import java.util.*;

public class ArraySum {

    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for(int i =0; i < n; i++){
            sum = sum + ar[i];
        }   
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,4,10,11};
        int result = simpleArraySum(ar.length, ar);
        System.out.println(result);
        ar = new int[]{-1,-1,-1,-1,-1};
        System.out.println(simpleArraySum(ar.length,ar));
    }
}
