package collectionPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * Map - HashMap
 * 	   - TreeMap 
 *     - LinkedMap
 *
 * */

public class MapPractice {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		for (int i = 0; i <Integer.parseInt(line[0]); i++) {
			hashmap.put(br.readLine(), 1);
		}
		for (int i = 0; i < Integer.parseInt(line[1]); i++) {
			String name = br.readLine();
			Integer v = hashmap.get(name);
			if (v == null) {
				v = 0;
			}
			v += 2;
			hashmap.put(name, v);
		}

		ArrayList<String> a = new ArrayList<String>();

		for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			if (value == 3) {
				a.add(key);
			}
		}
		System.out.println(a.size());
		Collections.sort(a);
		for (String name : a) {
			System.out.println(name);
		}
	}

}
