package graph;

import java.util.ArrayList;

public class DepthFirstSearch {
	// ���� �켱 Ž�� ��� ȣ���� �̿��� ���� �� �� �ִ�

	// dfs(x)�� �ǹ� x�� �湮�ߴ�!

	// ���� ����� ����� ���� /o(v^2) :v �� ������ ����
	static int[][] array;
	static boolean[] check;

	void dfs1(int x) {
		check[x] = true; // ���� ���� ���
		System.out.println(x);
		for (int i = 1; i <= array.length; i++) {
			if (array[x][i] == 0 && check[i] == false) {
				dfs1(i);
			}
		}
	}

	// ���� ����Ʈ�� �̿��� ���� / o(V+E) ��
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
