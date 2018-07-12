package stack;

import java.util.Scanner;

public class bracket {
	public static String isValid(String str) {
		int count = 0;
		str = str.trim();
		int n = str.length();

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '(') {
				count += 1;
			} else {
				count -= 1;
			}
			if (count < 0) {
				return "NO";
			}

		}

		if (count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		while(n --> 0){
			System.out.println(isValid(input.nextLine()));
		}
	}

}
