import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTriplets {
    
    public static int compareIntegers(int a ,int b){
        return a > b ? 0 : a < b ? 1 :  2;
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result = new int[3]; 
        int[] resultToRet = new int[2];
        result[compareIntegers(a0,b0)]++;
        result[compareIntegers(a1,b1)]++;
        result[compareIntegers(a2,b2)]++;
        resultToRet[0] = result[0];
        resultToRet[1] = result[1];
        return resultToRet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
