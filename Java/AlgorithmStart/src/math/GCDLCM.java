package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ��Ŭ���� ȣ������ ����Լ��� �̿��� �ִ�����, �ּҰ���� ���ϱ�
 * ����Լ��� �̿����� �ʰ� �ۼ� ����
 *
 * */
public class GCDLCM {
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(bf.readLine());

		for (int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int GCD = gcd(A, B);
			int LCM = A * B / GCD;

			System.out.println(LCM);
		}

	}

}
