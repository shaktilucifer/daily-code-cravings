/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BubbleSort{

	public int[] sortArray(int[] arrayToSort){
		int n = arrayToSort.length;
		int temp;
		for(int i = 0; i< n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arrayToSort[j] > arrayToSort[j+1]){
					temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = temp;
				}
			}
		}
		return arrayToSort;
	}
	
}

class BubbleSortTester
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BubbleSort b = new BubbleSort();
		int[] sortedArray = b.sortArray(new int[]{5,1,-2,1,1});
		for(int i=0; i < sortedArray.length; i++){
			System.out.println(sortedArray[i]+"\n");
		}
	}
}
