import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
	private static Optional pickNumbers(int n, int[] ar) {
		return Arrays.stream(ar).boxed().collect(Collectors.toSet()).stream()
			.map(dv -> {
				return Arrays.stream(ar).filter(v -> v==dv || v == dv - 1).count();
			}).max(Comparator.naturalOrder());
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		System.out.println(pickNumbers(n, a).get());
	}
}
