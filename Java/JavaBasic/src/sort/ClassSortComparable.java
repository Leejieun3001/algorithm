package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Java 에서 클래스를 정렬 할때 
 * Comparator 혹은 Comparable을 작성
 * */

//Comparable
class Point implements Comparable<Point> {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(Point that) {
		if (this.x < that.x) {
			return -1;
		} else if (this.x == that.x) {
			if (this.y < that.y) {
				return -1;
			} else if (this.y == that.y) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}
}

public class ClassSortComparable {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Point[] a = new Point[n];
		for (int i = 0; i < n; i++) {
			String[] temp = bf.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			a[i] = new Point(x, y);
		}
		Arrays.sort(a);
		StringBuilder sb = new StringBuilder();
		for (Point p : a) {
			sb.append(p.x + " " + p.y + "\n ");

		}
		System.out.println(sb);
	}
}
