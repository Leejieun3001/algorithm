package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make01 {

	public static int[] d;

	public static int topDownGO(int n) {
		if (n == 1)
			return 0;
		if (d[n] > 0)
			return d[n];
		d[n] = topDownGO(n - 1) + 1;

		if (n % 3 == 0) {
			int tmp = topDownGO(n / 3) + 1;
			if (d[n] > tmp) {
				d[n] = tmp;
			}
		}
		if (n % 2 == 0) {
			int tmp = topDownGO(n / 2) + 1;
			if (d[n] > tmp) {
				d[n] = tmp;
			}
		}
		return d[n];
	}

	public static int bottomUpGo(int n) {
		if (n < 2) {
			d[1] = 0;
		} else {
			for (int i = 2; i <= n; i++) {
				d[i] = d[i - 1] + 1;
				if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
					d[i] = d[i / 2] + 1;
				}
				if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
					d[i] = d[i / 3] + 1;
				}
			}
		}
		return d[n];
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		d = new int[x + 1];
		int s = topDownGO(x);
		System.out.println(s);
		d = new int[x + 1];
		System.out.println(bottomUpGo(x));
	}

}
