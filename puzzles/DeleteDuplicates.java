
import java.util.*;
import java.lang.*;
import java.io.*;

class DeleteDuplicates
{
	public void deleteDuplicates(int[] arr){
		int positionPointer = 1;
		for(int i=0;i<arr.length;i++){
			if(arr[positionPointer -1] != arr[i]){
				arr[positionPointer] = arr[i];
				positionPointer++;
			}
		}
		for(int i=positionPointer;i < arr.length ;i++){
		    arr[i] = 0;
		}
		printArray(arr);
	}
	
	public void printArray(int[] arr){
		for(int i=0; i< arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    DeleteDuplicates delObj = new DeleteDuplicates();
	    delObj.deleteDuplicates(new int[]{1,2,3,5,5,11,11,11,13});
	}
}
