package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();

		Queue<Integer> queue = new LinkedList<Integer>();

		while (testCase-- > 0) {
			String tmp = input.nextLine();
			String[] line = tmp.split(" ");

			String cmd = line[0];

			if (cmd.equals("push")) {
				queue.add(Integer.parseInt(line[1]));
			} else if (cmd.equals("pop")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(queue.peek());
				}
			} else if (cmd.equals("size")) {

				System.out.println(queue.size());

			} else if (cmd.equals("empty")) {

				if (queue.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}

			else if (cmd.equals("front")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(queue.poll());
				}

			} else if (cmd.equals("back")) {

				if (queue.isEmpty()) {
					System.out.println("1");
				} else {
					
				}
			}
		}
	}

}
