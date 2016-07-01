import java.io.*;
import java.util.*;

public class Par {
    public static int isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push('(');
			else if (s.charAt(i) == '{')
				stack.push('{');
			else if (s.charAt(i) == '[')
				stack.push('[');
			else if (s.charAt(i) == ')') {
				if (stack.isEmpty())
					return 0;
				if (stack.pop() != '(')
					return 0;
			} else if (s.charAt(i) == '}') {
				if (stack.isEmpty())
					return 0;
				if (stack.pop() != '{')
					return 0;
			} else if (s.charAt(i) == ']') {
				if (stack.isEmpty())
					return 0;
				if (stack.pop() != '[')
					return 0;
			}
			// ignore all other characters
		}
		return stack.isEmpty() ? 1 : 0;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String statement = in.nextLine();
		System.out.println(isBalanced(statement));
	}
}