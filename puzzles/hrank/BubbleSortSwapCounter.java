import java.io.*;
import java.util.*;

class BubbleSortSwapCounter {
	
	public void numSwapsBubbleSort(int[] a){
	    int numSwaps = 0;
        boolean isSwapped = true;
        for(int i=0; i < a.length || isSwapped == false; i++){
            isSwapped = false;
            for(int j=0; j < a.length - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps++;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length - 1]);
	System.out.println("Sorted array:");
        for(int a_i=0; a_i < a.length; a_i++){
            System.out.print(a[a_i]+" ");
        }
        System.out.println();
	}

    public static void main(String[] args) {
      
       BubbleSortSwapCounter bssc = new BubbleSortSwapCounter();
       bssc.numSwapsBubbleSort(new int[]{3,2,1});
       bssc.numSwapsBubbleSort(new int[]{3,-1,0,1,2,-9});
       bssc.numSwapsBubbleSort(new int[]{-9,-9,-9,-9,-9,-9});
       bssc.numSwapsBubbleSort(new int[]{19,-9,-9,-9,-9,-9});

    }
}
