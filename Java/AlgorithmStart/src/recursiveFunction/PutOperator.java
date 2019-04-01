package recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class PutOperator {
	static ArrayList<Integer> res = new ArrayList<>();

	static void go(int ans, int[] number, int index, int plus, int minus, int mul, int div) {
		if (plus < 0 || minus < 0 || mul < 0 || div < 0)
			return;

		if (index == number.length) {
			res.add(ans);
			return;
		}
		if (plus > 0)
			go(ans + number[index], number, index + 1, plus - 1, minus, mul, div);
		if (minus > 0)
			go(ans - number[index], number, index + 1, plus, minus - 1, mul, div);
		if (mul > 0)
			go(ans * number[index], number, index + 1, plus, minus, mul - 1, div);
		if (div > 0)
			go(ans / number[index], number, index + 1, plus, minus, mul, div - 1);

	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] operater = new int[4];

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int[] number = new int[n];

		for (int i = 0; i < n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 4; i++) {
			operater[i] = Integer.parseInt(st.nextToken());
		}

		go(number[0], number, 1, operater[0], operater[1], operater[2], operater[3]);
		Collections.sort(res);

		System.out.println(res.get(res.size() - 1));
		System.out.println(res.get(0));
	}

}
