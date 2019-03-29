package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModPractice {
	/*
	 * (A+B)%C=(A%C+B%C)% C
	 * (A*B)%C = (A%C * B%C)%C 
	 * ������ ������ ����� ����
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		System.out.println((A + B) % C);
		System.out.println((A % C) + (B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C) * (B % C) % C);

	}

}
