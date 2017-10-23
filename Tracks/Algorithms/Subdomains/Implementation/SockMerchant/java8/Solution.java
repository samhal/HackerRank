import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashSet;

public class Solution {

	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		Set<Integer> singleSocks = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int label = ar[i];
			if (singleSocks.contains(label)) {
				pairs += 1;
				singleSocks.remove(label);
			} else {
				singleSocks.add(label);
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
