import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String funnyString(String s){
    char[] chars = s.toCharArray();
    String isFunny = "Funny";
    for (int i = 1; i < chars.length; i++) {
      int diff = Math.abs(chars[i] - chars[i - 1]);
      int revDiff = Math.abs(chars[chars.length - i - 1] - chars[chars.length - i]);
      if (diff != revDiff) {
        isFunny = "Not Funny";
        break;
      }
    }
    return isFunny;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
      String s = in.next();
      String result = funnyString(s);
      System.out.println(result);
    }
  }
}
