package recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SecreteCode {

	public static void go(int n, String[] alpha, String password, int i) {

		if (password.length() == n) {
			if (check(password))
				System.out.println(password);
			return;
		}
		if (i >= alpha.length)
			return;
		go(n, alpha, password + alpha[i], i + 1);
		go(n, alpha, password, i + 1);

	}

	public static boolean check(String password) {
		int ja = 0;
		int mo = 0;
		for (char x : password.toCharArray()) {
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				mo += 1;
			} else {
				ja += 1;
			}

		}
		if (ja >= 2 && mo >= 1)
			return true;
		else
			return false;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		String[] alpha = new String[C];
		alpha = bf.readLine().split(" ");
		Arrays.sort(alpha);
		go(L, alpha, "", 0);

	}
}
