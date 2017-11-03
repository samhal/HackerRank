import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	// TODO: Make nicer
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Map<Integer, Integer> configs = new HashMap<>();
		for(int c_i=0; c_i < n; c_i++){
			configs.put(new Integer(c_i), new Integer(in.nextInt()));
		}
		int e = 100;
		Integer cloud = 0;
		do {
			cloud = (cloud + k) % n;
			e -= 1 + configs.get(cloud) * 2;
		} while(cloud != 0 && e >= 0);
		System.out.println(e);
	}
}
