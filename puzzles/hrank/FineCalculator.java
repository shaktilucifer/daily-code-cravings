// Sample Input

// 9 6 2015
// 6 6 2015
// Sample Output

// 45


import java.io.*;
import java.util.*;

class FineCalculator {
    
    public void printFine(int[] dateArray){
      int fine = 0;
        
        //Note: this condition gave your trouble. Always look for edge cases in normal order and reverse 
        if(dateArray[2] < dateArray[5] || (dateArray[2] == dateArray[5] && dateArray[1] < dateArray[4])){
            fine = 0;
            System.out.println(fine);
            return;
        }
         if(dateArray[2] > dateArray[5]){
              fine = 10000;
        }else if(dateArray[1] > dateArray[4]){
            fine = 500 *(dateArray[1] - dateArray[4]);
        }
        else if(dateArray[0] > dateArray[3]){
            fine = 15 * (dateArray[0] - dateArray[3]);
        }
        System.out.println(fine);
   
    }

    public static void main(String[] args) {
        int[] dateArray = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < dateArray.length; i++){
            dateArray[i] = sc.nextInt();
        }
        FineCalculator s = new FineCalculator();
        s.printFine(dateArray);
    }
}
