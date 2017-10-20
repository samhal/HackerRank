import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

	static int migratoryBirds(int n, int[] ar) {
		long[] idCount = IntStream.rangeClosed(1, 5).mapToLong(i ->{
			return Arrays.stream(ar).filter(v -> v == i).count();
		}).toArray();
		int maxId = 0;
		long max = 0;
		for (int i = 0; i < idCount.length; i++) {
			if (idCount[i] > max) {
				maxId = i + 1;
				max = idCount[i];
			}
		}
		return maxId;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
