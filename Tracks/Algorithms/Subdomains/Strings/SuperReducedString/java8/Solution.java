import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String super_reduced_string(String s){
    String reducedString = new String(s);
    for (int i = 1; i < reducedString.length(); i++) {
      if (reducedString.charAt(i) == reducedString.charAt(i - 1)) {
        reducedString = reducedString.substring(0, i - 1) +
          reducedString.substring(i + 1);
        i = 0;
      }
    }
    return (reducedString.isEmpty()) ? "Empty String" : reducedString;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = super_reduced_string(s);
    System.out.println(result);
  }
}
