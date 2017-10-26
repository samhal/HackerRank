import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
	// TODO: Can easily be optimized
	static int getMoneySpent(int[] keyboards, int[] drives, int s){
		return Arrays.stream(keyboards).map(kb -> {
			OptionalInt max = Arrays.stream(drives).filter(d -> d + kb <= s).max();
			return (max.isPresent()) ? max.getAsInt() + kb : -1;
		}).max().getAsInt();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] drives = new int[m];
		for(int drives_i=0; drives_i < m; drives_i++){
			drives[drives_i] = in.nextInt();
		}
		//  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
		int moneySpent = getMoneySpent(keyboards, drives, s);
		System.out.println(moneySpent);
	}
}
