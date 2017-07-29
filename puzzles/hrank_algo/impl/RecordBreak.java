import java.io.*;

public class RecordBreak {

    static int[] getRecord(int[] s){
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
       return new int[]{mostPointsCounter,leastPointsCounter};
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        System.out.println(result[0]+" "+ result[1]);
    }
}
// Note probably try doing this with a tree.


