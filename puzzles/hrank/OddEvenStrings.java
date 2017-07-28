// Sample Input
// 2 . - num samples
// Hacker
// Rank

// Sample Output
// Hce akr
// Rn ak

import java.io.*;
import java.util.*;

public class OddEvenStrings {

    public static void main(String[] args) {
        int testCases = 2;
        String[] arr = new String[testCases];
        arr[0] = "Hacker";
        arr[1] = "Rank";
        for(int i= 0; i < testCases;i++){
            String testCase = arr[i];
            char[] testCaseArr = testCase.toCharArray();
            for(int j=0; j <= testCaseArr.length -1; j = j + 2){
                System.out.print(testCaseArr[j]);
            }
            System.out.print(" ");
            for(int j=1; j <= testCaseArr.length -1; j = j + 2){
                System.out.print(testCaseArr[j]);
            }
            System.out.println("");
        }
   
        
    }
}
