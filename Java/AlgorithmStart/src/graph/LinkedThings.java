package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class LinkedThings {
	static ArrayList<Integer>[] arrayList;
	static boolean[] check;
	static int cnt;

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;
		while (!q.isEmpty()) {
			int x = q.remove();
			for (int y : arrayList[x]) {
				if (check[y] == false) {
					check[y] = true;
					q.add(y);
				}
			}
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arrayList = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			arrayList[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arrayList[v].add(e);
			arrayList[e].add(v);
		}
		check = new boolean[n + 1];
		int ans = 0;
		for (int i = 1; i <=n ; i++) {
			if (check[i] == false) {
				bfs(i);
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}
