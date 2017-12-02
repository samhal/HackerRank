import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {
	public static int numberNeeded(String first, String second) {
		int[] letterCount = new int[26];
		first.chars()
			.forEach(c -> letterCount[c - 'a']++);
		second.chars()
			.forEach(c -> letterCount[c - 'a']--);
		return Arrays.stream(letterCount)
			.reduce(0, (sum, count) -> sum += Math.abs(count));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
