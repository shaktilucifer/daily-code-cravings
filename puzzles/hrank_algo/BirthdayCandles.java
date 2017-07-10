import java.io.*;
import java.util.*;

class BirthdayCandles {

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
        int[] ar = new int[]{3,2,1,3};
        int result = birthdayCakeCandles(ar.length, ar);
        System.out.println(result);
        
        ar = new int[]{3,3,3,3};
        result = birthdayCakeCandles(ar.length, ar);
        System.out.println(result);
    }
}
