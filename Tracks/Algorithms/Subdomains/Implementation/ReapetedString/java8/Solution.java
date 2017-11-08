import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();
		long aCount = 0;
		long aCountInWord = s.chars().filter(l -> l == 'a').count();
		aCount += (n/s.length())*aCountInWord;
		aCount += (n % s.length() == 0) ? 0 : s.substring(0, (int) (n % s.length()))
			.chars().filter(l -> l == 'a').count();
		System.out.println(aCount);
	}
}
