import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

  static long marsExploration(String s) {
    final String sos = "SOS";
    return IntStream.range(0, s.length()).map(i -> {
      return (s.charAt(i) == sos.charAt(i % 3)) ? 0 : 1;
    }).sum();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    long result = marsExploration(s);
    System.out.println(result);
    in.close();
  }
}
