import java.util.*;
import java.lang.*;
import java.io.*;

class JollyJumpers
{
	public void iSJollyJumpers(int[] arrayOfNumbers,int size){
		boolean[] testArray = new boolean[size-1];
		for(int i=0; i<arrayOfNumbers.length - 1; i++){
			int absDiff = Math.abs(arrayOfNumbers[i] - arrayOfNumbers[i+1]);
			if(absDiff < size - 1){
				testArray[absDiff - 1] = true;
			}
		}
		
		for(int i =0 ;i < size - 2;i++){
			if(testArray[i] == false){
				System.out.println("Not Jolly Jumper");
				return;
			}
		}
		System.out.println("Jolly Jumper");
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		JollyJumpers jolly = new JollyJumpers();
		jolly.iSJollyJumpers(new int[]{19 ,22 ,24 ,25},4);

	}
}
