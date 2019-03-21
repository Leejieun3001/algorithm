package outInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Java Input/Output practice
 * 
 * BuffereadReader 효율적인 input 
 * StringBulider 효율적인 print
 * StringTokenizer 문자열을 잘라 사용할때 용이
 * */

public class BufferedReadferPractice {
	public static void main(String[] args) throws IOException {
		// 네수 더하기 FourNum();
		// 수 더하기 3 Num3();
		// 수 더하기 Num();
		// n 찍기 PrintN();
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
		String line = bf.readLine(); // 한줄을 입력 받음
		StringTokenizer st = new StringTokenizer(line);
		int sum = 0;

		while (st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}

		System.out.println(sum);
	}

	public static void Num() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine(); // 한줄을 입력 받음
		StringTokenizer st = new StringTokenizer(line, ","); // 구분자를 지정 할 수 있음
		int sum = 0;

		while (st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
	}

	public static void PrintN() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder(); // Scanner 보다 빠른 처리속도
		for (int i = 1; i <= n; i++) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}