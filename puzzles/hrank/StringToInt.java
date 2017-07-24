import java.io.*;
import java.util.*;

public class StringToInt {

    public static void main(String[] args) {
        String S = "ss";
        try{
            int sint = Integer.parseInt(S);
            System.out.println(sint);
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
