import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] path = in.next().toCharArray();
		int level = 0;
		int valleys = 0;
		for (char m : path) {
			level += (m == 'U') ? 1 : -1;
			valleys += (level == 0 && m == 'U') ? 1 : 0;
		}
		System.out.println(valleys);
	}
}
