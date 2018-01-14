import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

  static long theLoveLetterMystery(String s){
    final char[] chars = s.toCharArray();
    return IntStream.range(0, chars.length / 2).map(i -> {
      return Math.abs(chars[i] - chars[chars.length - 1 - i]);
    }).sum();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
      String s = in.next();
      long result = theLoveLetterMystery(s);
      System.out.println(result);
    }
  }
}
