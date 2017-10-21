import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String solve(int year){
		String month = "09";
		String day = "";
		if (year > 1918) {
			day = String.valueOf(
				256 - (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ?
					244 : 243));
		} else if (year < 1918) {
			day = String.valueOf(256 - ((year % 4 == 0) ? 244 : 243));
		} else {
			day = "26";
		}
		return String.format("%s.%s.%s", day, month, year);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
