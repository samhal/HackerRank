import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	for(int a0 = 0; a0 < t; a0++){
		long b = in.nextLong();
		long w = in.nextLong();
		long x = in.nextLong();
		long y = in.nextLong();
		long z = in.nextLong();
		long cheapestX = (x > y + z) ? y + z : x;
		long cheapestY = (y > x + z ) ? x + z : y;
		System.out.println(b*cheapestX + w*cheapestY);
	}
	}
}
