package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum123_03 {
	public static long[] d = new long[1000001];

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		int n;
		for (int i = 0; i < testCase; i++) {
			n = Integer.parseInt(bf.readLine());
			d[0] = 1;
			d[1] = 1;
			d[2] = 2;
			for (int k = 3; k <= n; k++) {
				d[k] = d[k - 3] + d[k - 2] + d[k - 1];
				d[k] %= 1000000009;
			}
			System.out.println(d[n]);
		}
	}
}
