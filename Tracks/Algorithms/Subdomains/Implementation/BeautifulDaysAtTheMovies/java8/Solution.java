import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.lang.Math;

public class Solution {

	private static long beautifulDays(int i, int j, int k) {
		return IntStream.rangeClosed(i, j).map(d -> {
			int reversed = reverse(d);
			return Math.abs(d - reversed) % k;
		}).filter(m -> m == 0).count();
	}

	private static int reverse(int d) {
		return Integer.parseInt(
			new StringBuilder(String.valueOf(d))
				.reverse()
				.toString()
		);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		System.out.println(beautifulDays(i, j, k));
	}
}
