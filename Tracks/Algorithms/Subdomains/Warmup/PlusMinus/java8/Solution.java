import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
			class SignCounter {
				int zeroes = 0;
				int positives = 0;
				int negatives = 0;

				void count(int n) {
					if (n > 0) this.positives++;
					else if (n < 0) this.negatives++;
					else this.zeroes++;
				}
			}
      Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			SignCounter sc = new SignCounter();
			for (int i = 0; i < n; i++) {
				sc.count(in.nextInt());
			}
			System.out.println((double) sc.positives / n);
			System.out.println((double) sc.negatives / n);
			System.out.println((double) sc.zeroes / n);
    }
}
