import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

	static long solve(int n, int[] s, int d, int m){
		final int[] chocolate = s;
		return IntStream.rangeClosed(0, s.length - m).map(i -> {
			return IntStream.range(i, i + m).map(index -> s[index]).sum();
		}).filter(sum -> sum == d).count();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int s_i=0; s_i < n; s_i++){
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		long result = solve(n, s, d, m);
		System.out.println(result);
	}
}
