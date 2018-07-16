package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JosephusPermutation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int size = input.nextInt();
		int time = input.nextInt();
		int[] permutation = new int[size];
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= size; i++) {
			queue.offer(i);
		}

		for (int k = 0; k < size; k++) {
			for (int i = 0; i < time - 1; i++) {
				queue.offer(queue.poll());
			}
			permutation[k] = queue.poll();
		}

		System.out.print("<");
		for (int i = 0; i < permutation.length; i++) {
			System.out.print(permutation[i]);
			if (i == permutation.length - 1) {
				System.out.print(">");
			} else {
				System.out.print(", ");
			}

		}

	}

}
