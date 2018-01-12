import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String hackerrankInString(String s) {
    String hackerRank = "hackerrank";
    int correctLetters = 0;
    for (int i = 0; i < s.length() && correctLetters < hackerRank.length(); i++) {
      if (correctLetters < s.length() && s.charAt(i) == hackerRank.charAt(correctLetters)) {
        correctLetters++;
      }
    }
    return (correctLetters == hackerRank.length()) ? "YES" : "NO";
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
      String s = in.next();
      String result = hackerrankInString(s.toLowerCase());
      System.out.println(result);
    }
    in.close();
  }
}
