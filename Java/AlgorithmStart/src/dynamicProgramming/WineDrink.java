package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WineDrink {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(bf.readLine());
		}
		int[][] d = new int[n + 1][3];

		for (int i = 1; i <= n; i++) {

			// 0번 연속해서 마신 포도수
			int tmp = d[i - 1][0];
			if (tmp < d[i - 1][1])
				tmp = d[i - 1][1];
			if (tmp < d[i - 1][2])
				tmp = d[i - 1][2];
			d[i][0] += tmp;

			// 1번 연속해서 마신 포도주
			d[i][1] += d[i - 1][0] + a[i - 1];

			// 2번 연속해서 마신 포도주
			d[i][2] += d[i - 1][1] + a[i - 1];

		}
		int ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
		
		System.out.println(ans);

	}
}
