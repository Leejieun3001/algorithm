package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class FindRoad {
	public static String[][] map;
	public static final int[] dx = { 0, 0, 1, -1 };
	public static final int[] dy = { 1, -1, 0, 0 };
	public static int[][] dist;

	public static void bfs(boolean[][] check, int x, int y, int n, int m) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		check[x][y] = true;
		while (!q.isEmpty()) {
			Pair p = q.remove();
			x = p.x;
			y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (0 <= nx && nx < n && 0 <= ny && ny < m) {
					if (check[nx][ny] == false && map[nx][ny].equals("1")) {
						q.add(new Pair(nx, ny));
						dist[nx][ny] = dist[x][y] + 1;
						check[nx][ny] = true;

					}
				}
			}
		}

	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new String[n][m];
		for (int i = 0; i < n; i++) {
			map[i] = bf.readLine().split("");
		}

		boolean[][] check = new boolean[n][m];
		dist = new int[n][m];
		dist[0][0] = 1;
		for (int y = 0; y < n; y++) {
			for (int x = 0; x < m; x++) {
				if (check[y][x] == false && map[y][x].equals("1")) {
					bfs(check, 0, 0, n, m);
				}
			}
		}
		System.out.println(dist[n-1][m-1]);

	}

}
