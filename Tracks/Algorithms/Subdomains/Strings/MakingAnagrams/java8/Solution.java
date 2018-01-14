import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int makingAnagrams(String s1, String s2){
    final Map<Character, Integer>  charCount = new HashMap<>();
    for (Character c : s1.toCharArray()) {
      charCount.put(
        c,
        charCount.getOrDefault(c, 0) + 1
      );
    }
    for (Character c : s2.toCharArray()) {
      charCount.put(
        c,
        charCount.getOrDefault(c, 0) - 1
      );
    }
    int sum = 0;
    for (Integer count : charCount.values()) {
      sum += Math.abs(count);
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    int result = makingAnagrams(s1, s2);
    System.out.println(result);
  }
}
