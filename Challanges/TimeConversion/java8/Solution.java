import java.io.*;
import java.math.*;
import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) throws ParseException {
        SimpleDateFormat inputDateFormatter = new SimpleDateFormat("hh:mm:ssa");
				SimpleDateFormat outputDateFormatter = new SimpleDateFormat("HH:mm:ss");
				Date date = inputDateFormatter.parse(s);
				return outputDateFormatter.format(date);
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
