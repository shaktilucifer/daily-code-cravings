import java.io.*;
import java.util.*;

public class PosNegZero {

    public static void main(String[] args) {
        int arr[] = new int[]{-4,3,-9,0,4,1};
        int n = arr.length;
        double zeroes=0.0,pos=0.0,neg = 0.0;
        for(int i=0; i < n; i++){
            //total is jus a dummy variable, to enable the ternary operator, and saves multiple ifs 
           double total = arr[i] > 0 ? pos++ : arr[i] < 0 ? neg++ : zeroes++;
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zeroes/n);
    }
}
// Sample Input

// 6
// -4 3 -9 0 4 1         
// Sample Output

// 0.500000
// 0.333333
// 0.166667
