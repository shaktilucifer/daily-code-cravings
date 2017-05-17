
import java.util.*;
import java.lang.*;
import java.io.*;

class StackArray{

    private Object[] stack;
    private int size;
    
    StackArray(){
        this.stack = new Object[100];
        this.size = -1;
    }
    
    public StackArray push(Object data){
        
        if(size < stack.length){
            size++;
            stack[size] = data;
        }else{
            System.out.println("Stack is full!");
        }
        return this;
    }
    
    public Object pop(){
        if(!isEmpty()){
          return stack[size--];   
        }
        System.out.println("Cannot pop empty stack");
        return null;
    }
    
    public int size(){
        return size + 1;
    }
    
    public boolean isEmpty(){
        return size < 0;
    }
    
    public void printStack(){
        int i =0;
        while(stack[i] != null){
            System.out.println(stack[i++]);
        }
    }
    
		
}

class StackArrayTester
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
        StackArray stackArray = new StackArray();
        stackArray.push(2.2).push(2.4);
        System.out.println(stackArray.size());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop()); // This should throw an excepton
        System.out.println(stackArray.size());
        
        stackArray.push("Imprfectluck").push("Strings");
        stackArray.printStack();

	}
}
