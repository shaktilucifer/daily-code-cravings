import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumDifference
{
	int[] elements;
	int maximumDifference;
	
    MaximumDifference(int[] elements){
        this.elements = elements;
    }   
    public void computeDifferenceBySorting(){
        Arrays.sort(this.elements);
        maximumDifference = Math.abs(this.elements[0] - this.elements[this.elements.length - 1]);
    }

    public void computeDifferenceMinMax(){
        int arraySize = elements.length;
        int max = elements[0];
        int min = elements[0];
        for(int i=0; i< arraySize; i++){
            max = Math.max(max , elements[i]);
            min = Math.min(min, elements[i]);
        }
        maximumDifference = Math.abs(max - min);
    }

	
	public static void main (String[] args) throws java.lang.Exception
	{
		MaximumDifference m = new MaximumDifference(new int[]{1,2,5});
		MaximumDifference m1 = new MaximumDifference(new int[]{8, 19, 3, 2, 7});
		m.computeDifferenceBySorting();
		System.out.println(m.maximumDifference);
		m.computeDifferenceMinMax();
		System.out.println(m.maximumDifference);
		
		m1.computeDifferenceBySorting();
		System.out.println(m1.maximumDifference);
		m1.computeDifferenceMinMax();
		System.out.println(m1.maximumDifference);
		
		}
}
