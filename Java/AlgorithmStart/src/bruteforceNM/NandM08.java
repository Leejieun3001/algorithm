package bruteforceNM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NandM08 {
	static int[] array;
	static int[] ans;

	public static void go(int index, int start, int n, int m) {
		if (index == m) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < m; i++) {
				sb.append(ans[i] + " ");

			}
			sb.append("\n");
			System.out.print(sb);
			return;

		}
		for (int i = start; i < n; i++) {

			ans[index] = array[i];
			go(index + 1, i, n, m);

		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		array = new int[N];
		ans = new int[M];

		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		go(0, 0, N, M);

	}
}
