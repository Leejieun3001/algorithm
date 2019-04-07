package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyingCard {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] p = new int[n + 1];
		int[] d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		d[1] = p[1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int tmp = d[i - j] + p[j];
				if (tmp > d[i]) {
					d[i] = tmp;
				}
			}
		}
		System.out.println(d[n]);
	}
}
