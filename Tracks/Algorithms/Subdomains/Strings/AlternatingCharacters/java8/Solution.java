import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int alternatingCharacters(String s){
    char[] chars = s.toCharArray();
    int count = 0;
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i+1]) count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
      String s = in.next();
      int result = alternatingCharacters(s);
      System.out.println(result);
    }
  }
}
