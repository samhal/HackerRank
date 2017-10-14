import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
				arr = Arrays.stream(arr).sorted().toArray();
				System.out.println(
					String.format(
						"%s %s",
						sum(arr, 0, 3),
						sum(arr, 1, 4)
					)
				);
    }
		public static long sum(long[] arr, int from, int to) {
			return IntStream
				.rangeClosed(from, to)
				.mapToLong(i -> arr[i])
				.sum();
		}
}
