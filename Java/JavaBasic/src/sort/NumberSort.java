package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*
 * Java sort
 * 기본 오름차순 정렬은 Collection 혹은 Array 이용해 정렬 가능
 * */
public class NumberSort {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> a = new ArrayList<Integer>();
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			a.add(tmp);
			b[i] = tmp;

		}
		Collections.sort(a);
		Arrays.sort(b);
		for (int x : a) {
			System.out.println(x);
		}
		for (int x : b) {
			System.out.println(x);
		}

	}
}
