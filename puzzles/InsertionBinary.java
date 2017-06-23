import java.util.*;
import java.lang.*;
import java.io.*;


class InsertionBinary
{
	public int findInsertionPoint(int[] sortedArr,float value){
		int low = 0;
		int high = sortedArr.length;
		while(low < high){
			int mid = (low + high) / 2;
			if(sortedArr[mid] == value){
				return mid;
			}
			if(sortedArr[mid] > value){
				high = mid;
			}else{
				low = mid + 1;
			}
		}
		return low;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		InsertionBinary i = new InsertionBinary();
	int index =	i.findInsertionPoint(new int[]{1,2,3,4,5,6,7,9},9);
	System.out.println(index);
		
	}
}
