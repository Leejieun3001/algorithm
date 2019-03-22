package collectionPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class PersonInOffice {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bf.readLine());
		HashSet<String> hashSet = new HashSet<String>();
		while (count-- > 0) {
			String[] temp = bf.readLine().split(" ");
			if (temp[1].equals("enter")) {
				hashSet.add(temp[0]);
			} else {
				hashSet.remove(temp[0]);
			}
		}
		String[] ans = hashSet.toArray(new String[hashSet.size()]);
		Arrays.sort(ans);
		for (int i = ans.length - 1; i >= 0; i--) {
			System.out.println(ans[i]);
		}
	}

}
