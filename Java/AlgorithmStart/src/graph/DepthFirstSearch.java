package graph;

import java.util.ArrayList;

public class DepthFirstSearch {
	// 깊이 우선 탐색 재귀 호출응 이용해 구현 할 수 있다

	// dfs(x)의 의미 x에 방문했다!

	// 인접 행렬을 사용한 구현 /o(v^2) :v 는 정점의 갯수
	static int[][] array;
	static boolean[] check;

	void dfs1(int x) {
		check[x] = true; // 현재 정점 출력
		System.out.println(x);
		for (int i = 1; i <= array.length; i++) {
			if (array[x][i] == 0 && check[i] == false) {
				dfs1(i);
			}
		}
	}

	// 인접 리스트를 이용한 구현 / o(V+E) ㅣ
	static ArrayList<Integer>[] arrayList;
	static boolean[] check2;

	public static void dfs2(int x) {
		if (check2[x])
			return;
		check2[x] = true;
		System.out.print(x + " ");
		for (int y : arrayList[x]) {
			if (check2[y] == false) {
				dfs2(y);
			}
		}
	}

}
