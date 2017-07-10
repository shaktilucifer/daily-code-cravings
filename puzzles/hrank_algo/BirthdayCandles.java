import java.io.*;
import java.util.*;

public class BirthdayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
            Integer max = -1;
            Integer numCandles = 0;
        Map<Integer,Integer> map = new HashMap<>();
            for(int i=0; i < n; i++){
                if(ar[i] > max){
                    max = ar[i];   
                }
                 if(map.containsKey(ar[i])){
                      map.put(ar[i],map.get(ar[i]) + 1);
                  }else{
                      map.put(ar[i], 1);

                 }
            }
        return map.get(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
