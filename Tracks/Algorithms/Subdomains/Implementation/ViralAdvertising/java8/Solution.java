import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {
	// TODO Better solution plz
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 2;
		int lastElem = 5;
		for (int i = 1; i < n; i++) {
			int new_val = (lastElem /2) * 3;
			sum += new_val/2;
			lastElem = new_val;
		}
		System.out.println(sum);
	}
}
