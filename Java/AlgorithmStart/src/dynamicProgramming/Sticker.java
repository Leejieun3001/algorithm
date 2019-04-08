package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sticker {
	public static int sticker[][];
	public static int d[][];

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		StringTokenizer st;

		for (int t = 0; t < testCase; t++) {
			int n = Integer.parseInt(bf.readLine());
			sticker = new int[2][n + 1];
			d = new int[n + 1][3];
			st = new StringTokenizer(bf.readLine());
			for (int i = 0; i < n; i++) {
				sticker[0][i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(bf.readLine());
			for (int i = 0; i < n; i++) {
				sticker[1][i] = Integer.parseInt(st.nextToken());
			}

			d[0][0] = 0;
			d[0][1] = sticker[0][0];
			d[0][2] = sticker[1][0];
			for (int i = 1; i <= n; i++) {
				// 뜯지 않을 경우 (D[i][0])
				int tmp = d[i - 1][0];
				if (tmp < d[i - 1][1])
					tmp = d[i - 1][1];
				if (tmp < d[i - 1][2])
					tmp = d[i - 1][2];
				d[i][0] += tmp;
				// 위에 스티커를 뜯은 경우 (D[i][1])
				tmp = d[i - 1][0];
				if (tmp < d[i - 1][2])
					tmp = d[i - 1][2];
				d[i][1] += tmp + sticker[0][i];

				// 아래 스티커를 뜯은 경우(D[i][2])
				tmp = d[i - 1][0];
				if (tmp < d[i - 1][1])
					tmp = d[i - 1][1];
				d[i][2] += tmp + sticker[1][i];
			}

			int ans = d[n][0];
			if (ans < d[n][1])
				ans = d[n][1];
			if (ans < d[n][2])
				ans = d[n][2];
			System.out.println(ans);

		}

	}

}
