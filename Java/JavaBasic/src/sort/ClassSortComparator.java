package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//Comparator
public class ClassSortComparator {
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
		Arrays.sort(a, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				return p1.compareTo(p2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (Point p : a) {
			sb.append(p.x + " " + p.y + "\n");
		}
		System.out.print(sb);
	}
}
