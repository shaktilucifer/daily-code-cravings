import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String[] time = s.split(":");
        String hour = time[0];
        if(time[2].charAt(2) == 'A'){

            if(hour.equals("12")){

               hour = "00";
            }
        }else{
            if(!hour.equals("12")){
                int sum = Integer.parseInt(hour) + 12;
                hour = sum+"";
            }
        }
        return hour+":"+time[1]+":"+time[2].charAt(0)+time[2].charAt(1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
