import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

  static long camelcase(String s) {
    return s.chars()
      .mapToObj(i -> (char) i)
      .filter(c -> Character.isUpperCase(c))
      .count() + 1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    long result = camelcase(s);
    System.out.println(result);
    in.close();
  }
}
