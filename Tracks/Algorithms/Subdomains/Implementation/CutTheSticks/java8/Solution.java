import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] sticks = new Integer[n];
		for (int i = 0; i < n; i++) {
			sticks[i] = Integer.valueOf(in.nextInt());
		}
		Arrays.sort(sticks, Collections.reverseOrder());
		Integer cut = 0;
		for (int i = n - 1; i > 0;) {
			while(i >= 0 && sticks[i] <= cut) --i;
			if (i >= 0) {
				System.out.println(i + 1);
				cut = sticks[i];
			}
		}
	}
}
