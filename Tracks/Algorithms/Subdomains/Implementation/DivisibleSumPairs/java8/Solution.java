import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

	static long divisibleSumPairs(int n, int k, int[] ar) {
		return IntStream.rangeClosed(1, n).mapToLong(i -> {
										int val = ar[i-1];
										return IntStream.range(i, n).map(j -> val + ar[j])
																		.filter(sum -> sum % k == 0).count();
		}).sum();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		long result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
