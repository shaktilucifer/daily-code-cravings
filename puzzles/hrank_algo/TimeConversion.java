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
        String s = "12:00:00PM";
        String result = timeConversion(s);
        System.out.println(result);

        s = "01:00:00PM";
        result = timeConversion(s);
        System.out.println(result);

        s = "12:00:00AM";
        result = timeConversion(s);
        System.out.println(result);
    }
}
// Sample Input

// 07:05:45PM
// Sample Output

// 19:05:45
