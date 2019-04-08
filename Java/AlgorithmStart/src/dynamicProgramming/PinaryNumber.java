package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinaryNumber {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long[][] d = new long[n + 1][2];
		d[1][0] = 0;
		d[1][1] = 1;
		for (int i = 2; i <= n; i++) {

			d[i][0] += d[i - 1][1] + d[i - 1][0];
			d[i][1] += d[i - 1][0];
		}

		long ans = d[n][0] + d[n][1];
		System.out.println(ans);
	}

}
