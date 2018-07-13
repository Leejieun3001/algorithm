package stack;

import java.util.Scanner;
import java.util.Stack;

public class editor {

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine().trim();
		int testCase = Integer.parseInt(input.nextLine());
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			left.push(str.charAt(i));
		}
		while (testCase-- > 0) {
			String[] line = input.nextLine().split(" ");
			char cmd = line[0].charAt(0);
			if (cmd == 'L') {
				if (!left.empty()) {
					right.push(left.pop());
				}
			} else if (cmd == 'D') {
				if (!right.empty()) {
					left.push(right.pop());
				}
			} else if (cmd == 'P') {
				char c = line[1].charAt(0);
				left.push(c);
			} else if (cmd == 'B') {
				if (!left.empty()) {
					left.pop();
				}
			}
		}
		while (!left.empty()) {
			right.push(left.pop());
		}
		StringBuilder answer = new StringBuilder();
		while (!right.empty()) {
			answer.append(right.pop());
		}
		System.out.println(answer);
	}
}
