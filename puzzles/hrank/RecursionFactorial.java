import java.io.*;
import java.util.*;

public class RecursionFactorial {
    
    public int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
        
    }

    public static void main(String[] args) {
        int num = 34; // Test case 
        RecursionFactorial rf = new RecursionFactorial();
        System.out.println(rf.factorial(num));        
    }
}
