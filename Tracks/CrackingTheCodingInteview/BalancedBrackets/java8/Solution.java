import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean isBalanced(String expression) {
		if (expression.length() % 2 != 0) return false;
		Stack<Character> bracketStack = new Stack();
		for (Character bracket : expression.toCharArray()) {
			switch(bracket) {
				case '(':
					bracketStack.push(')');
					break;
				case '[':
					bracketStack.push(']');
					break;
				case '{':
					bracketStack.push('}');
					break;
				default:
					if(bracketStack.empty() || bracketStack.pop() != bracket)
						return false;
			}
		}
		return bracketStack.empty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
		String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}
}
