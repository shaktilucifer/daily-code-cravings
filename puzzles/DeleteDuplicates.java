
import java.util.*;
import java.lang.*;
import java.io.*;

class DeleteDuplicates
{
	public void deleteDuplicates(int[] arr){
		int positionPointer = 1;
		for(int i=0;i<arr.length - 1;i++){
			if(arr[positionPointer -1] != arr[i]){
				arr[positionPointer] = arr[i];
				positionPointer++;
			}
		}
	}
	
	public void printArray(int[] arr){
		for(int i=0; i< arr.length - 1; i++){
			System.out.println(arr[i])
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	}
}
