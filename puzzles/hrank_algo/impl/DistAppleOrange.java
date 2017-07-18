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
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
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

// 1
// 1
