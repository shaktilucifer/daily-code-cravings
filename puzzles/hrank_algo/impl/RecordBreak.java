import java.io.*;

public class RecordBreak {

    static void getRecord(int[] s){
        int mostPointsCounter = 0, leastPointsCounter = 0;
        int max = s[0],min = s[0];
        for(int i=1; i < s.length; i++){
          if(s[i] > max){
              mostPointsCounter++;
              max = s[i];
          }else if(s[i] < min){
              leastPointsCounter++;
              min = s[i];
          }
        }
        System.out.println(mostPointsCounter+" "+ leastPointsCounter);
    
    }

    public static void main(String[] args) {
        int[] s = new int[]{10 ,5 ,20 ,20 ,4 ,5 ,2 ,25 ,1};
        printRecord(s);
    }
}
// Note probably try doing this with a tree.

// Sample Input 0

// 9
// 10 5 20 20 4 5 2 25 1

// Sample Output 0

// 2 4
