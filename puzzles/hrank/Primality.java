// Sample Input

// 3
// 12
// 5
// 7
// Sample Output

// Not prime
// Prime
// Prime
import java.io.*;
import java.util.*;

class Primality {
    
    public void printPrimality(int checkPrime){
            if(checkPrime == 1){
                System.out.println("Not prime");
                return;
            }
            int squareRoot = (int)Math.sqrt(checkPrime);
            
            for(int j = 2; j <= squareRoot; j++){
                if(checkPrime % j == 0){
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime");
            return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int samples = sc.nextInt();
        Primality p = new Primality();  
        for(int i=0; i < samples; i++ ){
           p.printPrimality(sc.nextInt());
        }
    
    }
}
