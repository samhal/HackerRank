import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.lang.Integer;

public class Solution {

	static int[] getRecord(int[] s){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minBeat = 0;
		int maxBeat = 0;

		for (int i = 0; i < s.length; i++) {
			int score = s[i];
			if (score < min) {
				minBeat++;
				min = score;
			}
			if (score > max) {
				maxBeat++;
				max = score;
			}
		}
		return new int[]{maxBeat - 1, minBeat - 1};
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int s_i=0; s_i < n; s_i++){
			s[s_i] = in.nextInt();
		}
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
		for (Integer val : result) {
			System.out.print(separator + val);
			separator = delimiter;
		}
		System.out.println("");
	}
}
