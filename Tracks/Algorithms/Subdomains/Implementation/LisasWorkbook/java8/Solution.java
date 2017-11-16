import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] problems = new int[n];
		for (int i = 0; i < n; i++) {
			problems[i] = in.nextInt();
		}
		int page = 1;
		int specialProblems = 0;
		int chapter = 0;
		int problem = 1;
		while (chapter < n) {
			int numOfProblems = problems[chapter];
			int lastProblem = (problem + k - 1 < numOfProblems) ?
				problem + k - 1 :
				numOfProblems;
			specialProblems += (problem <= page && page <= lastProblem) ? 1 : 0;
			page += 1;
			problem += k;
			if (problem > numOfProblems) {
				problem = 1;
				chapter += 1;
			}
		}
		System.out.println(specialProblems);
	}
}
