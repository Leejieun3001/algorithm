package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LISMax {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] array = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			d[i] = array[i];
			for (int j = 0; j < i; j++) {
				if (array[j] < array[i] && d[i] < d[j] + array[i])

					d[i] = d[j] + array[i];
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (ans < d[i])
				ans = d[i];
		}
		System.out.println(ans);
	}

}
