import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

	static int bonAppetit(int n, int k, int b, int[] ar) {
		return (int) IntStream.range(0, n)
										.filter(i -> i != k)
										.mapToDouble(x -> (double) ar[x]/2)
										.reduce(b, (x, y) -> x - y);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int b = in.nextInt();
		int result = bonAppetit(n, k, b, ar);
		String output = (result != 0) ? String.valueOf(result) : "Bon Appetit";
		System.out.println(output);
	}
}
