import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEvenStrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i= 0; i < testCases;i++){
            String testCase = s.next();
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
