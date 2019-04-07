package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Dynamic Programming (다이나믹 프로그래밍)
 * 큰 문제를 작은 문제로 나눠서 푸는 알고리즘
 * (+ 분할 정복과 차이점 : DP는 작은 문제가 반복
 * 				       분할 정복은 작은 문제가 중복되지 않음
 * 
 * 만족 조건
 * 1. Overlapping subproblem -> 부분 문제가 겹친다
 * 2. Optimal substructure -> 최적 부분 구조 이다
 * 
 * 구현 방법 
 * 1. Top-down (재귀함수 이용)
 * 2. Bottom-up (for문이용)
 *  
 *  적합한 점화식을 찾는 것이 중요하다!
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
