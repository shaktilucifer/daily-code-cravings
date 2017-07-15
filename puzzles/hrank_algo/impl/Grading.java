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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
