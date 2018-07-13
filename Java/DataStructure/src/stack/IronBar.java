package stack;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String braketStr = input.nextLine().trim();
		Stack<Integer> stack = new Stack<Integer>();
		int len = braketStr.length();
		int answer = 0;

		for (int i = 0; i < len; i++) {
			if (braketStr.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (stack.peek() + 1 == i) {
					stack.pop();
					answer += stack.size();

				} else {
					stack.pop();
					answer += 1;
				}
			}
		}
		System.out.println(answer);
	}
}
