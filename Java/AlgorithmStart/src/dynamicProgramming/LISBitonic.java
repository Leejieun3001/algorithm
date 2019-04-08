package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LISBitonic {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		int[] d1 = new int[n];
		int[] d2 = new int[n];

		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			d1[i] = 1;
			for (int j = 0; j < i; j++) {
				if (array[j] < array[i] && d1[i] < d1[j] + 1) {
					d1[i] = d1[j] + 1;
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			d2[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j] && d2[j] + 1 > d2[i]) {
					d2[i] = d2[j] + 1;
				}
			}
		}

		int ans = d1[0] + d2[0] - 1;
		for (int i = 1; i < n; i++) {
			if (ans < d1[i] + d2[i] - 1) {
				ans = d1[i] + d2[i] - 1;
			}
		}
		System.out.println(ans);
	}
}
