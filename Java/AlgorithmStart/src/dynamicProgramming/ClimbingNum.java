package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbingNum {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] d = new int[n + 1][11];
		for (int i = 0; i < 10; i++)
			d[1][i] = 1;
		// ������ ���� ����(n��)
		for (int i = 2; i <= n; i++) {
			// ������ ��
			for (int j = 0; j <= 9; j++) {
				// �� �� ���� ��
				for (int k = 0; k <= j; k++) {
					d[i][j] += d[i - 1][k];
					d[i][j] %= 10007;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < 10; i++)
			ans += d[n][i];
		System.out.println(ans % 100007);
	}

}
