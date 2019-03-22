package collectionPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/*
 * Java Collections practice
 * 
 * ArrayList  결국 배열  입력, 삭제 , 추가 O(n)걸림  , 
 *            인접리스트 만들때 가장 많이 사용 
 * LinkedList 자주 사용 안함
 * Stack	  
 * Set - HashSet 일반적인 경우
 *     - TreeSet 순서가 중요한 경우 
 *     - LinkedHashSet 입력으로 넣는 순서가 중요한 경우
 * */
public class CollectionPractice {
	public static void main(String args[]) throws IOException {
		// NumberSort();
		// HashSetTest();
		// HashSetTest();
	}

	public static void NumberSort() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < testCase; i++) {
			int temp = Integer.parseInt(bf.readLine());
			a.add(temp);
		}
		// 정렬시 collections 사용
		Collections.sort(a);
		for (int x : a) {
			System.out.println(x);

		}
	}

	// HashSet 순서 보장이 안된다 , 무엇이 있는지 여부를 확인할때 사용
	public static void HashSetTest() {
		HashSet<Integer> H = new HashSet<Integer>();
		TreeSet<Integer> T = new TreeSet<Integer>();
		LinkedHashSet<Integer> L = new LinkedHashSet<Integer>();
		for (int i = 20; i >= 1; i--) {
			H.add(i);
			T.add(i);
			L.add(i);
		}
		for (int x : H) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : T) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : L) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
