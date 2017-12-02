import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		Map<String, Integer> magazineWordCount = new HashMap<>();
		for(int magazine_i=0; magazine_i < m; magazine_i++){
			String word = in.next();
			Integer wordCount = magazineWordCount.getOrDefault(word, 0);
			magazineWordCount.put(word, wordCount + 1);
		}
		for(int ransom_i=0; ransom_i < n; ransom_i++){
			String word = in.next();
			Integer wordCount = magazineWordCount.getOrDefault(word, 0);
			if (wordCount == 0) {
				System.out.println("No");
				return;
			} else {
				magazineWordCount.put(word, wordCount - 1);
			}
		}
		System.out.println("Yes");
	}
}
