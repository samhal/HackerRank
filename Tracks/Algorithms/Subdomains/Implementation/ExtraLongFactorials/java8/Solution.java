import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		BigInteger factorial = IntStream.rangeClosed(1, n)
			.mapToObj(BigInteger::valueOf)
			.reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
		System.out.println(factorial.toString());
	}
}
