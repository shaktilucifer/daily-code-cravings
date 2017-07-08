import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    
    public void printReverse(int[] arr,int n){        
        //Printing in reverse
         for(int i=n-1; i >=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int[] arr = new int[]{12,3,4,5,22};
        Solution s= new Solution();
        s.printReverse(arr,arr.length);
        arr = new int[]{1,4,3,2};
        s.printReverse(arr,arr.length);
        arr = new int[]{-1,-1,-1,-1};
        s.printReverse(arr,arr.length);
    }
}
// Sample Input

// 4
// 1 4 3 2
// Sample Output

// 2 3 4 1
