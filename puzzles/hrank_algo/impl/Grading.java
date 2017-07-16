import java.io.*;
import java.util.*;

public class Grading {

    static int[] solve(int[] grades){
        int length = grades.length;
        int[] roundedResults = new int[length];
        for(int i=0; i < length; i++){
            int modDiff = grades[i] % 5;
            if(grades[i] < 38 || modDiff < 3){
                roundedResults[i] = grades[i];
            }else{
                roundedResults[i] = grades[i] + (5 - modDiff);

            }
        }
        return roundedResults;
    }

    public static void main(String[] args) {
        int grades[] = new int[]{33,38,73,67}; // output: 33,40,75,67 
        int grades1[] = new int[]{0,100,39,40}; // output: 0,100,40,40
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println("");
    }
}
// Sample Input 0

// 4
// 73
// 67
// 38
// 33
// Sample Output 0

// 75
// 67
// 40
// 33
