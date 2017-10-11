import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			char[] step = new char[n];
			IntStream.rangeClosed(1, n).forEach(i -> {
				Arrays.fill(step, 0, n, ' ');
				Arrays.fill(step, n-i, n, '#');
				System.out.println(new String(step));
			});
    }
}
