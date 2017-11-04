import java.io.*;
import java.util.*;

public class Solution {

	private static int divisibleDigits(int v) {
		int n = v;
		int count = 0;
		while(n > 0) {
			int digit = n % 10;
			count += (digit != 0 && v % digit == 0) ? 1 : 0;
			n /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(divisibleDigits(in.nextInt()));
		}
	}
}
