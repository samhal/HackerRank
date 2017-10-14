import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
      Map<Integer, Integer> occurences = new HashMap<>();
			int max = Arrays.stream(ar).reduce(0, (a, b) -> {
				if (b >= a) {
					occurences.put(b, occurences.getOrDefault(b, 0) + 1);
					return b;
				}
				return a;
			});
			return occurences.get(max);
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] ar = new int[n];
      for(int ar_i = 0; ar_i < n; ar_i++){
          ar[ar_i] = in.nextInt();
      }
      int result = birthdayCakeCandles(n, ar);
      System.out.println(result);
    }
}
