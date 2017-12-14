import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] chars = in.nextLine().toCharArray();
		int columns = (int) Math.ceil(Math.sqrt(chars.length));
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < columns; i++) {
			for(int j = i; j < chars.length; j += columns) {
				builder.append(chars[j]);
			}
			builder.append(' ');
		}
		System.out.println(builder.toString());
	}
}
