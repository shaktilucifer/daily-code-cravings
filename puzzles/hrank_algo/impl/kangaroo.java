import java.io.*;
import java.util.*;
// Tips to future me:
// stop thinking to mathematically. less is more
//think of edge cases and run time exceptions
// 

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
           if(v2 == v1 || v2 > v1 || (x2 - x1)%(v2 - v1) != 0){
              return "NO";
           }else{
              return "YES";
           }
    }

    public static void main(String[] args) {
     
        String result = kangaroo(0, 3, 2, 4);
        System.out.println(result);
        System.out.println(kangaroo(0,2,5,3);
    }
}

            
