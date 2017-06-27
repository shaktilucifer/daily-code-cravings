import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public void printReverse(int[] arr,int n){        
        //Printing in reverse
         for(int i=n-1; i >=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Solution s= new Solution();
        s.printReverse(arr,n);
    }
}
// Sample Input

// 4
// 1 4 3 2
// Sample Output

// 2 3 4 1
