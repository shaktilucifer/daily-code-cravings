import java.io.*;

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
    
    static void printArray(int[] result){
        for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
    }

    public static void main(String[] args) {
        int[] result = solve(5, 6, 7, 3, 6, 10);
        int[] result1 = solve(3,4,5,12,1,1);
        printArray(result);
        printArray(result1);
        System.out.println("");
    }
}
// Sample Input

// 5 6 7
// 3 6 10
// Sample Output

// 1 1 
