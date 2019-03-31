package justdo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenBoys {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] tall = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			tall[i] = Integer.parseInt(bf.readLine());
			sum += tall[i];

		}
		Arrays.sort(tall);
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - tall[i] - tall[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (i == k || j == k)
							continue;
						System.out.println(tall[k]);
					}
					System.exit(0);
				}

			}
		}
	}
}
