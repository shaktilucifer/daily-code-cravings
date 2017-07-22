import java.io.*;

public class DistAppleOrange {
    public static void printNumFruits(int[] apple, int[] orange){
          
        int appleCounter = 0;
        int orangeCounter = 0;
        
        for(int i=0; i < m; i++){
            int appleDist = apple[i] + a;
            if(appleDist >= s && appleDist <= t){
                appleCounter++;
            }
        }
        for(int j=0; j < n; j++){
            int orangeDist = orange[j] + b;
            if(orangeDist >= s && orangeDist <= t){
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a =  5;
        int b = 15;
        int m = 3;
        int n = 3;
        int[] apple = new int[]{-2,2,1};
        int[] orange = new int[]{5,-6};
        printNumFruits(apple,orange);
    }
}


// Sample Input 0

// 7 11
// 5 15
// 3 2
// -2 2 1
// 5 -6
// Sample Output 0

// 1  apples within distance
// 1 orange within distance
