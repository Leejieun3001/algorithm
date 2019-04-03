package bruteforceNM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NandM05 {
	static int[] array;
	static int[] ans;
	static int[] cnt;

	public static void go(int index, int n, int m) {
		if (index == m) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < m; i++) {
				sb.append(ans[i] + " ");

			}
			sb.append("\n");
			System.out.print(sb);
			return;

		}
		for (int i = 0; i < n; i++) {
			if (cnt[i] > 0) {
				ans[index] = array[i];
				cnt[i] -= 1;
			}
			go(index + 1, n, m);
			cnt[i] += 1;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		array = new int[N];
		cnt = new int[N];
		ans = new int[M];
		int[] temp = new int[N];
		for (int i = 0; i < N; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(temp);

		int k = 0;
		int x = temp[0];
		int c = 1;
		for (int i = 1; i < N; i++) {
			if (x == temp[i]) {
				c += 1;
			} else {
				array[k] = x;
				cnt[k] = c;
				k += 1;
				x = temp[i];
				c = 1;
			}
		}
		array[k] = x;
		cnt[k] = c;

		N = k + 1;
		go(0, N, M);

	}
}
