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
    
    public void printMinMaxFast(int[] arr){
    	long max = 0;
    	long min = 999999;
    	long sum = 0;
    	for(int i=0; i < 5; i++){
    		sum += arr[i];
    		if(max < arr[i]){
    			max = arr[i];
    		}
    		if(min > arr[i]){
    			min = arr[i];
    		}
    	}
    	System.out.println((sum-max)+" "+(sum-min));
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
        System.out.println();
        mm.printMinMaxFast(arr);
         int[] arr1 = new int[] {
            5,
            4,
            3,
            2,
            1
        };
        mm.printMinMaxFast(arr1);
         int[] arr2 = new int[] {
            1,
            1,
            1,
            1,
            1
        };
       mm.printMinMaxFast(arr2);

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
