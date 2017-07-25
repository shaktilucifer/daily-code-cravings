import java.io.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int words = 1;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) >=65 && s.charAt(i) <= 90){
                words++;
            }
        }
        System.out.print(words);
    }
}


// Sample Input

// saveChangesInTheEditor

//5 words in camelcase format and hence output is 5
// Sample Output

// 5
