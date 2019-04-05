package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TomatosFac {
	public static String[][] map;
	public static boolean[][] check;
	public static int[][] dist;
	public static final int[] dx = { 0, 0, 1, -1 };
	public static final int[] dy = { 1, -1, 0, 0 };

	public static void bfs(int x, int y, int m, int n) {

	}

	public static void main(String args[]) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		map = new String[n][m];
		dist = new int[n][m];
		check = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			map[i] = bf.readLine().split(" ");
		}

		Queue<Pair> q = new LinkedList<Pair>();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {

				if (map[i][k].equals("1")) {
					q.add(new Pair(i, k));
					check[i][k] = true;
					dist[i][k] = 0;
				}
			}
		}

		while (!q.isEmpty()) {
			Pair p = q.remove();
			int x = p.x;
			int y = p.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (0 <= nx && nx < n && 0 <= ny && ny < m) {
					if (check[nx][ny] == false && map[nx][ny].equals("0")) {
						q.add(new Pair(nx, ny));
						check[nx][ny] = true;
						dist[nx][ny] = dist[x][y] + 1;
					}
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				if (ans < dist[i][k]) {
					ans = dist[i][k];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				if (map[i][k].equals("0") && dist[i][k] == 0) {
					ans = -1;
				}
			}

		}

		System.out.println(ans);
	}
}
