import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String args[] ) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> sequence = new HashMap<>();
		for (Integer i = 0; i < n;i++) {
			Integer p = new Integer(in.nextInt());
			sequence.put(p, i + 1);
		}
		IntStream.rangeClosed(1, n).forEach(i -> {
			Integer y = sequence.get(sequence.get(new Integer(i)));
			System.out.println(y);
		});
	}
}
