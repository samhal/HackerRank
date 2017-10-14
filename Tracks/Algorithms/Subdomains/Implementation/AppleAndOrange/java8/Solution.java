import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int s = in.nextInt();
			int t = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int m = in.nextInt();
			int n = in.nextInt();

			long appleCount =
				IntStream.range(0, m)
					.map(i -> in.nextInt() + a)
					.filter(pos -> (pos >= s && pos <= t))
					.count();

			long orangeCount =
				IntStream.range(0, n)
					.map(i -> in.nextInt() + b)
					.filter(pos -> (pos >= s && pos <= t))
					.count();

			System.out.println(appleCount);
			System.out.println(orangeCount);
    }
}
