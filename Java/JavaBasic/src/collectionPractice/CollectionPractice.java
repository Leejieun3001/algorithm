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
 * ArrayList  �ᱹ �迭  �Է�, ���� , �߰� O(n)�ɸ�  , 
 *            ��������Ʈ ���鶧 ���� ���� ��� 
 * LinkedList ���� ��� ����
 * Stack	  
 * Set - HashSet �Ϲ����� ���
 *     - TreeSet ������ �߿��� ��� 
 *     - LinkedHashSet �Է����� �ִ� ������ �߿��� ���
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
		// ���Ľ� collections ���
		Collections.sort(a);
		for (int x : a) {
			System.out.println(x);

		}
	}

	// HashSet ���� ������ �ȵȴ� , ������ �ִ��� ���θ� Ȯ���Ҷ� ���
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
