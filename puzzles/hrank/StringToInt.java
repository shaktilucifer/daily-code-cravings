import java.io.*;
import java.util.*;

public class StringToInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int sint = Integer.parseInt(S);
            System.out.println(sint);
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
