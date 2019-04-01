package recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeaveOffice {
	static int maxPay = 0;
	static int[] task;
	static int[] pay;
	static int n;

	public static void go(int index, int totalDay, int totalPay) {
		if (totalDay > n || index > n)
			return;
		if (index == n) {
			if (maxPay < totalPay) {
				maxPay = totalPay;
			}

			return;
		}
		go(index + task[index], totalDay + task[index], totalPay + pay[index]);
		go(index + 1, totalDay, totalPay);

	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		task = new int[n];
		pay = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			task[i] = Integer.parseInt(st.nextToken());
			pay[i] = Integer.parseInt(st.nextToken());

		}
		go(0, 0, 0);
		System.out.println(maxPay);
	}
}
