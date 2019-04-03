package bruteforceNM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM01 {
	static boolean[] check;
	static int[] ans;

	public static void go(int index, int n, int m) {
		// Á¾·á
		if (index == m) {
			for (int x : ans) {
				System.out.print(x + " ");
			}
			System.out.println();
			return;

		}
		for (int i = 1; i <= n; i++) {
			if (check[i])
				continue;
			check[i] = true;
			ans[index] = i;
			go(index + 1, n, m);
			check[i] = false;
		}

	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		check = new boolean[10];
		ans = new int[M];
		go(0, N, M);

	}

}
