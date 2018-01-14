import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner in = new Scanner(System.in);
    String sentence = in.nextLine();
    Set<Character> chars  = new HashSet<>();
    for (Character c : sentence.toLowerCase().toCharArray()) {
      if(c != ' ') chars.add(c);
    }
    System.out.println((chars.size() > 25) ? "pangram" : "not pangram");
  }
}
