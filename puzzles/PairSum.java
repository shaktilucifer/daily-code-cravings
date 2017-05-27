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
		
		Pair(int index1,int index2){
			this.index1 = index1;
			this.index2 = index2;
		}
		public void printIndices(){
				System.out.println(index1);
		System.out.println(index2);
		}
	}
	
	public Pair findPair(int[] array,int sum){
		HashMap<Integer,Integer> diffMap = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length-1;i++){
			int diff = sum - array[i];
			if(diffMap.containsKey(array[i])){
				Pair pair = new Pair(diffMap.get(array[i]),i);
				return pair;
			}else{
				diffMap.put(diff,i);
			}
		}
		return null;
	}
	

	public static void main(String[] args){
		PairSum p = new PairSum();
		Pair pair =	p.findPair(new int[]{8, 7, 2, 5, 3, 1},10);
		pair.printIndices();
		pair =	p.findPair(new int[]{2, 7, 2, 5, 3, 1},10);
		pair.printIndices();

	}
}
