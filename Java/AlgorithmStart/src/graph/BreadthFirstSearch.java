package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	// 넓이 우선 탐색
	static boolean[] check;
	// 인접행렬 사용
	static int[][] array;

	public static void bfs1(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;
		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
			for (int i = 1; i <= array.length; i++) {
				if (array[x][i] == 1 && check[i] == false) {
					check[i] = true;
					q.add(i);
				}
			}
		}
	}

	// 인접 리스트 사용
	static ArrayList<Integer>[] arrayList;

	public static void bfs2(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		check[start] = true;
		q.add(start);
		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.println(x);
			for (int y : arrayList[x]) {
				if (check[y] == false) {
					check[y] = true;
					q.add(y);
				}
			}
		}
	}

}
