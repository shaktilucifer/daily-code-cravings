import java.util.*;
import java.lang.*;
import java.io.*;

interface AdvancedArithmaticIntface{
	int divisorSum(int n);
}

class CalculatorIface implements AdvancedArithmaticIntface
{
	public int divisorSum(int n){
        int sum = 0;
        for(int i=1; i <= n; i++){
            if(n % i == 0){
                sum = sum + (n / i);
            }
        }
        return sum;
     }
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		CalculatorIface c = new CalculatorIface();
		System.out.println(c.divisorSum(6));
		System.out.println(c.divisorSum(10));
		System.out.println(c.divisorSum(1100));
		System.out.println(c.divisorSum(19));
	}
}
