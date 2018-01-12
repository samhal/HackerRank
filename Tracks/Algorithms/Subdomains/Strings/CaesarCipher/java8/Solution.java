import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

  static String caesarCipher(String s, final int k) {
    return s.chars().mapToObj(i -> {
      char c = (char) i;
      if (Character.isLetter(c)) {
        char a = (Character.isUpperCase(c)) ? 'A' : 'a';
        c = (char) (a + (c - a + k) % 26);
      }
      return Character.toString(c) ;
    }).reduce("", (a, b) -> a + b);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String s = in.next();
    int k = in.nextInt();
    String result = caesarCipher(s, k);
    System.out.println(result);
    in.close();
  }
}
