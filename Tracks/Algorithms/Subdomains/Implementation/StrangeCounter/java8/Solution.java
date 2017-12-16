import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		long value = 3;
		while (t > value) {
			t = t - value;
			value *= 2;
		}
		System.out.println(value - t + 1);
	}
}
