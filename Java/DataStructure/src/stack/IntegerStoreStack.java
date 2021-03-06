package stack;

import java.util.*;

public class IntegerStoreStack {
	public static void main(String args[])  {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < num; i++) {
			String line = input.nextLine();
			String[] str = line.split(" ");
			String command = str[0];

			if (command.equals("push")) {
				int number = Integer.parseInt(str[1]);
				stack.push(number);
			} else if (command.equals("top")) {
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
			} else if (command.equals("size")) {
				System.out.println(stack.size());
			} else if (command.equals("empty")) {
				if (stack.empty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (command.equals("pop")) {
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				}
			}

		}

	}

}
