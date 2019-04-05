package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideGame {
	public static final int MAX = 1000000;

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		boolean[] check = new boolean[MAX];
		int[] dist = new int[MAX];
		check[n] = true;
		dist[n] = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);

		while (!q.isEmpty()) {
			int now = q.remove();
			if (now - 1 >= 0 && check[now - 1] == false) {
				check[now - 1] = true;
				dist[now - 1] = dist[now] + 1;
				q.add(now - 1);
			}
			if (now + 1 < MAX && check[now + 1] == false) {
				check[now + 1] = true;
				dist[now + 1] = dist[now] + 1;
				q.add(now + 1);
			}
			if (now * 2 < MAX && check[now * 2] == false) {
				check[now * 2] = true;
				dist[now * 2] = dist[now] + 1;
				q.add(now * 2);
			}

		}
		System.out.println(dist[k]);
	}
}
