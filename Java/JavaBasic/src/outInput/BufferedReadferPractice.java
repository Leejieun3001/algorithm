package outInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Java Input/Output practice
 * 
 * BuffereadReader ȿ������ input 
 * StringBulider ȿ������ print
 * StringTokenizer ���ڿ��� �߶� ����Ҷ� ����
 * */

public class BufferedReadferPractice {
	public static void main(String[] args) throws IOException {
		// �׼� ���ϱ� FourNum();
		// �� ���ϱ� 3 Num3();
		// �� ���ϱ� Num();
		// n ��� PrintN();
	}

	public static void FourNum() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans);
	}

	public static void Num3() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine(); // ������ �Է� ����
		StringTokenizer st = new StringTokenizer(line);
		int sum = 0;

		while (st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}

		System.out.println(sum);
	}

	public static void Num() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine(); // ������ �Է� ����
		StringTokenizer st = new StringTokenizer(line, ","); // �����ڸ� ���� �� �� ����
		int sum = 0;

		while (st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
	}

	public static void PrintN() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder(); // Scanner ���� ���� ó���ӵ�
		for (int i = 1; i <= n; i++) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}