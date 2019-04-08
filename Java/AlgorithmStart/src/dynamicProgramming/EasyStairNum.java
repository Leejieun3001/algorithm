package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EasyStairNum {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long[][] d = new long[n+1][10];

		for (int i = 1; i <= 9; i++)
			d[1][i] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				d[i][j] = 0;
				if (j - 1 >= 0)
					d[i][j] += d[i - 1][j - 1];
				if (j + 1 <= 9)
					d[i][j] += d[i - 1][j + 1];
				d[i][j] %= 1000000000L;
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++)
			ans += d[n][i];
		ans %= 1000000000L;
		System.out.println(ans);

	}

}
