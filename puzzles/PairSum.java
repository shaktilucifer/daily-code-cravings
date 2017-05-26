// Given an unsorted array of integers, find a pair with given sum in it.

// For example,

// Input:
// arr = [8, 7, 2, 5, 3, 1]
// sum = 10

// Output: 
// Pair found at index 0 and 2 (8 + 2)
// OR
// Pair found at index 1 and 4 (7 + 3)

import java.util.*;
import java.lang.*;
import java.io.*;
class PairSum{
	class Pair{
		int index1;
		int index2;
	}
	
	public PairSum findPair(int[] array,int sum){
		HashMap<Integer,Integer> diffMap = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length() -1;i++){
			int diff = sum - array[i];
			if(diffMap.containsKey(array[i])){
			System.out.println(diffMap.get(array[i]));
			System.out.println(i);
			}else{
				diffMap.put(diff,i);
			}
		}
		
	}
	

	public static void main(String[] args){

	}
}
