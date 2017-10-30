import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Character, Integer> heights = new HashMap<>();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0; i < 26; i++){
			heights.put(Character.toLowerCase(alphabet[i]), in.nextInt());
		}
		String word = in.next();
		int area = word.chars()
			.mapToObj(c -> heights.get((char) c))
			.mapToInt(h -> (Integer) h).max().getAsInt() * word.length();
		System.out.println(area);
	}
}
