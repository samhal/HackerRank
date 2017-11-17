import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.stream.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		IntStream.range(0, n).map(i -> {
			int a = in.nextInt();
			int b = in.nextInt();
			return (int) (Math.floor(Math.sqrt(b) - Math.ceil(Math.sqrt(a)) + 1));
		}).forEach(System.out::println);
	}
}
