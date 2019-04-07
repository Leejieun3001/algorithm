package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Dynamic Programming (���̳��� ���α׷���)
 * ū ������ ���� ������ ������ Ǫ�� �˰���
 * (+ ���� ������ ������ : DP�� ���� ������ �ݺ�
 * 				       ���� ������ ���� ������ �ߺ����� ����
 * 
 * ���� ����
 * 1. Overlapping subproblem -> �κ� ������ ��ģ��
 * 2. Optimal substructure -> ���� �κ� ���� �̴�
 * 
 * ���� ��� 
 * 1. Top-down (����Լ� �̿�)
 * 2. Bottom-up (for���̿�)
 *  
 *  ������ ��ȭ���� ã�� ���� �߿��ϴ�!
 * 
 * */
public class FibonacciPracticeDP {
	// Top-down
	public static final int MAX = 10000000;

	public static int topDownFibo(int n) {
		int[] ans = new int[MAX];
		ans[0] = 1;
		ans[1] = 1;
		if (n < 2) {
			return ans[n];
		} else {
			if (ans[n] == 0) {
				ans[n] = topDownFibo(n - 1) + topDownFibo(n - 2);
			}

			return ans[n];
		}
	}

	public static int bottomUpFibo(int n) {
		int[] ans = new int[MAX];
		ans[0] = 1;
		ans[1] = 1;
		if (n < 2) {
			return ans[n];
		} else {
			for (int i = 2; i <= n; i++) {
				ans[i] = ans[i - 1] + ans[i - 2];
			}

			return ans[n];
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int result = topDownFibo(n - 1);
		System.out.println(result);
		result = bottomUpFibo(n - 1);
		System.out.println(result);

	}

}
