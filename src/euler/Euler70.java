package euler;

import java.util.ArrayList;
import java.util.Collections;

public class Euler70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMin();
		// System.out.println(judgeD(1234,3211));
	}

	public static void findMin() {
		double min = 10;
		int num = 0;
		for (int i = 1; i < 10000000; i=i+2) {
			System.out.println(i);
			int count = 0;
				for (int j = 1; j < i; j = j + 2) {

					if (judge(i, j)) {
						count += 1;
					}
				}
			double temp = ((double) i) / ((double) count);
			if (judgeD(count, i) && temp < min) {
				System.out.println(temp + "  " + i);
				min = temp;
				num = i;
			}
		}
		System.out.println(num);
	}

	public static boolean judge(int n, int m) {

		int tempMax = m > n ? m : n;
		int tempMin = m > n ? n : m;
		int temp = tempMax % tempMin;
		if (n == 1 || m == 1) {
			return true;
		}

		if (temp == 0) {
			return false;
		}
		n = m > n ? n : m;
		return judge(temp, n);
	}

	public static boolean judgeD(int a, int b) {
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		ArrayList<Integer> numsA = new ArrayList();
		ArrayList<Integer> numsB = new ArrayList();
		if (strA.length() != strB.length()) {
			return false;
		}
		for (int i = 0; i < strA.length(); i++) {
			numsA.add(Integer.valueOf(strA.substring(i, i + 1)));
			numsB.add(Integer.valueOf(strB.substring(i, i + 1)));

		}
		Collections.sort(numsA);
		Collections.sort(numsB);
		if (numsA.equals(numsB)) {
			return true;
		}

		return false;

	}

}
