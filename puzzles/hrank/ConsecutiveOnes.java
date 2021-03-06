// Given a base- integer, , convert it to binary (base-).
// Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.
/*
Sample Case 1: 
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2: 
The binary representation of  is , so the maximum number of consecutive 's is .
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ConsecutiveOnes {
	private int max(int a, int b){
		return a > b ? a : b;
	}
	
	public int countMaxConsecutiveOnes(int n){
		 int max = 0;
        int reminder = 0;
        int onesCounter = 0;
        while(n > 0){
            reminder = n % 2;
            if(reminder == 1){
                onesCounter++;
            }else{ 
                    max = max(max,onesCounter);
                    onesCounter = 0;
            }
            n = n / 2;         
        }
        return max(max,onesCounter);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(new ConsecutiveOnes().countMaxConsecutiveOnes(n));
       
    }
}
