import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int minDist = n;
		Map<Integer, Integer> lastIndexes = new HashMap<>();
		for(Integer i=0; i < n; i++){
			Integer v = Integer.valueOf(in.nextInt());
			Integer lastIndex = lastIndexes.getOrDefault(v, -(n + i));
			minDist = (i - lastIndex < minDist) ? i - lastIndex : minDist;
			lastIndexes.put(v, i);
		}
		System.out.println((minDist == n) ? -1 : minDist);
	}
}
