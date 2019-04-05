package floodfill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class GiveNum {
	static String[][] array;

	public static final int[] dx = { 0, 0, 1, -1 };
	public static final int[] dy = { 1, -1, 0, 0 };

	public static void bfs(int[][] group, int x, int y, int cnt, int n) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		group[x][y] = cnt;

		while (!q.isEmpty()) {
			Pair p = q.remove();
			x = p.x;
			y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if (array[nx][ny].equals("1") && group[nx][ny] == 0) {
						q.add(new Pair(nx, ny));
						group[nx][ny] = cnt;
					}
				}

			}

		}

	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		array = new String[n][n];
		for (int i = 0; i < n; i++) {
			array[i] = bf.readLine().split("");
		}

		int cnt = 0;
		int[][] group = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j].equals("1") && group[i][j] == 0) {
					bfs(group, i, j, ++cnt, n);
				}
			}
		}
		int[] ans = new int[cnt];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (group[i][j] != 0) {
					ans[group[i][j] - 1] += 1;
				}
			}
		}

		Arrays.sort(ans);
		System.out.println(cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.println(ans[i]);
		}
	}

}
