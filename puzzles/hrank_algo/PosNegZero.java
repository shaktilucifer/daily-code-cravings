import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PosNegZero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double zeroes=0.0,pos=0.0,neg = 0.0;
        for(int i=0; i < n; i++){
           double total = arr[i] > 0 ? pos++ : arr[i] < 0 ? neg++ : zeroes++;
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zeroes/n);


    }
}
