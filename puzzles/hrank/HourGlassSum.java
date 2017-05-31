import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class HourGlassSum {
	
	public int findMaxHourGlassSum(int[][] arr){
		// this is the tricky part, think about negative values and set max as the most minimum value
		int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =1; i<5; i++){
            for(int j=1; j<5;j++){
                sum = arr[i][j] 
                    + arr[i-1][j+1] + arr[i-1][j] + arr[i-1][j-1] 
                    + arr[i+1][j+1] + arr[i+1][j] + arr[i+1][j-1];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(new HourGlassSum().findMaxHourGlassSum(arr));
    }
}
