package recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum123 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		for (int i = 0; i < testCase; i++) {
			int num = Integer.parseInt(bf.readLine());
			System.out.println(go(0, num));

		}
	}

	static int go(int sum, int goal) {
		if (sum > goal)
			return 0;
		if (sum == goal)
			return 1;
		int now = 0;
		for (int i = 1; i <= 3; i++) {
			now += go(sum + i, goal);
		}
		return now;

	}
}
