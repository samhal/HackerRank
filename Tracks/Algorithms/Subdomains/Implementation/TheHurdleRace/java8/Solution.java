import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for(int height_i=0; height_i < n; height_i++){
			height[height_i] = in.nextInt();
		}
		int maxHeight = IntStream.of(height).max().getAsInt();
		int minBev = maxHeight > k ? maxHeight - k : 0;
		System.out.println(minBev);
	}
}
