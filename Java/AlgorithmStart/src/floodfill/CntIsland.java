package floodfill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pairs {
	int x;
	int y;

	Pairs(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class CntIsland {
	public static final int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
	public static final int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };

	public static void bfs(String map[][], boolean[][] group, int x, int y, int w, int h, int cnt) {
		Queue<Pairs> q = new LinkedList<Pairs>();
		q.add(new Pairs(x, y));
		group[x][y] = true;
		while (!q.isEmpty()) {
			Pairs p = q.remove();
			x = p.x;
			y = p.y;
			for (int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (0 <= nx && nx < h && ny >= 0 && ny < w) {
					if (group[nx][ny] == false && map[nx][ny].equals("1")) {
						q.add(new Pairs(nx, ny));
						group[nx][ny] = true;

					}
				}
			}
		}
	}

	public static void main(String args[]) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(bf.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0)
				break;
			String[][] map = new String[h][w];

			for (int i = 0; i < h; i++) {
				map[i] = bf.readLine().split(" ");
			}
		
			int cnt = 0;
			boolean[][] group = new boolean[h][w];
			for (int x = 0; x < h; x++) {
				for (int y = 0; y < w; y++) {
					if (map[x][y].equals("1") && group[x][y] == false) {
						bfs(map, group, x, y, w, h, ++cnt);

					}
				}
			}
			System.out.println(cnt);
		}

	}
}
