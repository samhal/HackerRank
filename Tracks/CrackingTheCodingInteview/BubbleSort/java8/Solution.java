import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		BubbleSortResult r = bubbleSort(a);
		System.out.println(
			String.format(
				"Array is sorted in %d swaps.",
				r.numOfSwaps
			)
		);
		System.out.println(
			String.format(
				"First Element: %d",
				r.firstElement
			)
		);
		System.out.println(
			String.format(
				"Last Element: %d",
				r.lastElement
			)
		);
	}

	private static BubbleSortResult bubbleSort(int[] arr) {
		int lastUnsorted = arr.length - 1;
		int swaps = 0;
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if (arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
					isSorted = false;
					swaps++;
				}
			}
			lastUnsorted--;
		}
		BubbleSortResult r = new BubbleSortResult();
		r.numOfSwaps = swaps;
		r.firstElement = arr[0];
		r.lastElement = arr[arr.length - 1];
		return r;
	}

	private static void swap(int[] arr, int i, int j) {
		int valI = arr[i];
		int valJ = arr[j];
		arr[i] = valJ;
		arr[j] = valI;
	}

	private static class BubbleSortResult {
		public int numOfSwaps = 0;
		public int firstElement = Integer.MIN_VALUE;
		public int lastElement = Integer.MAX_VALUE;
	}
}
