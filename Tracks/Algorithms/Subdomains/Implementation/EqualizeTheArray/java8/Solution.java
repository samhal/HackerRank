import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> counts = new HashMap<>();
		int maxCount = 0;
		for (int i = 0; i < n; i++) {
			Integer v = in.nextInt();
			Integer count = counts.getOrDefault(v, 0) + 1;
			maxCount = (count > maxCount) ? count : maxCount;
			counts.put(v, count);
		}
		System.out.println(n - maxCount);
	}
}
