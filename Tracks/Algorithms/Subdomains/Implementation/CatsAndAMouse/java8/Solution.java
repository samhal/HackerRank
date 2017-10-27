import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;

public class Solution {
	private static String query(int a, int b, int c) {
		int bDist = Math.abs(c - b);
		int aDist = Math.abs(c - a);
		if (aDist == bDist) return "Mouse C";
		else return (aDist < bDist) ? "Cat A" : "Cat B";
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			System.out.println(query(x, y, z));
		}
	}
}
