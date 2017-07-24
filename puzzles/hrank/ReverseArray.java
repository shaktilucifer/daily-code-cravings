// Task 
// Given an array,A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.

// Sample Input

// 4
// 1 4 3 2
// Sample Output

2 3 4 1
import java.io.*;
import java.util.*;


public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,2};
        int n = arr.length;
        for(int i=n-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
