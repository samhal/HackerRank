import java.io.*;
import java.util.*;
import java.lang.Math;


public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
			int n = Integer.valueOf(in.nextLine());
			int primaryDiagonalSum = 0;
			int secondaryDiagonalSum = 0;
			for (int i = 0; i < n; i++) {
				String[] values = in.nextLine().split(" ");
				primaryDiagonalSum += Integer.valueOf(values[i]);
				secondaryDiagonalSum += Integer.valueOf(values[n - 1 - i]);
			}
			System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}
