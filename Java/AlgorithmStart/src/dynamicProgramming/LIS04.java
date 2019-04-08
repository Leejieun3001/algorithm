package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS04 {
	public static int[] array;
	public static int[] d;
	public static int[] v;

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		array = new int[n];
		d = new int[n];
		v = new int[n];

		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			v[i] = -1;
			for (int j = 0; j < i; j++) {
				if (array[j] < array[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
					v[i] = j;

				}
			}

		}

		int ans = d[0];
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (ans < d[i]) {
				ans = d[i];
				p = i;

			}
		}
		System.out.println(ans);
		StringBuilder sb = new StringBuilder();
		while (p != -1) {
			sb.insert(0, array[p] + " ");
			p = v[p];
		}
		System.out.println(sb);

	}
}