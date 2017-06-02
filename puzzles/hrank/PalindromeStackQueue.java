import java.util.*;
import java.lang.*;
import java.io.*;

class PalindromeStackQueue {
    Stack<Character> stack;
    Queue<Character> queue;
    
    PalindromeStackQueue(){
        stack = new Stack<Character>();
        queue = new LinkedList<Character>();
    }
    
    public boolean isPalindrome(char[] palindromeString){
    	
    	for(int i =0; i < palindromeString.length; i++){
    		stack.push(palindromeString[i]);
    		queue.add(palindromeString[i]);
    	}
    	for(int i =0; i < palindromeString.length; i++){
    		if(stack.pop() != queue.remove()){
    			return false;
    		}
		}
    	return true;
    	
    }
    
    public static void main (String[] args) throws java.lang.Exception
	{
		String s = "racecar";
		PalindromeStackQueue p = new PalindromeStackQueue();
		if(p.isPalindrome(s.toCharArray())){
		System.out.println("It is a palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
	}
}
