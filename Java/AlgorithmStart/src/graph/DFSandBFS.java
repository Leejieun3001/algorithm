package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSandBFS {
	static ArrayList<Integer>[] array;
	static boolean[] check;

	public static void dfs(int start) {
		if (check[start])
			return;
		check[start] = true;
		System.out.print(start + " ");
		for (int y : array[start]) {
			if (check[y] == false) {
				dfs(y);
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;
		
		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
			for (int y : array[x]) {
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
		int start = Integer.parseInt(st.nextToken());
		array = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			array[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			array[u].add(v);
			array[v].add(u);
		}
		// 문제의 조건 때문에 sort
		for (int i = 1; i < n + 1; i++) {
			Collections.sort(array[i]);
		}
		check = new boolean[n + 1];
		dfs(start);

		System.out.println();
		check = new boolean[n + 1];
		bfs(start);

	}
}
