import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

	static int getTotalX(int[] a, int[] b) {
		int aMax = Arrays.stream(a).max().getAsInt();
		int bMin = Arrays.stream(b).min().getAsInt();
		return IntStream.rangeClosed(aMax, bMin)
										.filter(i -> {
											return (Arrays.stream(a)
																		.filter(aVal -> i % aVal != 0)
																		.count() == 0) ? true : false;
										})
										.filter(i -> {
											return (Arrays.stream(b)
																		.filter(bVal -> bVal % i != 0)
																		.count() == 0) ? true : false;
										})
										.reduce(0, (x, y) -> x + 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for(int b_i = 0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
