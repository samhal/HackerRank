import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
		class Scores {
			int alice = 0;
			int bob = 0;

			Scores comparePoints(int a, int b) {
				this.alice += (a > b) ? 1 : 0;
				this.bob += (a < b) ? 1 : 0;
				return this;
			}

			int[] finalizeScores() {
				return new int[]{this.alice, this.bob};
			}
		}

		return new Scores()
			.comparePoints(a0, b0)
			.comparePoints(a1, b1)
			.comparePoints(a2, b2)
			.finalizeScores();
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a0 = in.nextInt();
      int a1 = in.nextInt();
      int a2 = in.nextInt();
      int b0 = in.nextInt();
      int b1 = in.nextInt();
      int b2 = in.nextInt();
      int[] result = solve(a0, a1, a2, b0, b1, b2);
      for (int i = 0; i < result.length; i++) {
          System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
      }
      System.out.println("");


  }
}
