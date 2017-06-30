
// Sample Input

// 6 
// Sample Output

//      #
//     ##
//    ###
//   ####
//  #####
// ######
// Explanation
import java.io.*;

class Staircase {
	
	public void printStairCase(int n){
		     for(int i=0; i<n ; i++){
            for(int j=0;j<n;j++ ){
                if(j < n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
	}

    public static void main(String[] args) {
	    int n =10;
   		Staircase stairs = new Staircase();
	    stairs.printStairCase(n);
    }
}
