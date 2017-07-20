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
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
