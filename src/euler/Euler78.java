package euler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Euler78 {
	// public static BigInteger[][] countWays=new BigInteger[80000][80000];

	public static Map<String, BigInteger> countWays = new HashMap();;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
//		findMinN();
		System.out.println(countWays(300));
		long stopMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计：" + (stopMili - startMili) + "毫秒");
	}

	public static void findMinN() {
		System.out.println("start");
		// countWays[2][2]=BigInteger.ONE;
		countWays.put("2,2", BigInteger.ONE);
		for (int i = 2;; i++) {
			System.out.println(i);
			String str = String.valueOf(countWays(i).add(BigInteger.ONE));
			if (str.length() > 6) {
				if (str.substring(str.length() - 6, str.length()).equals(
						"000000")) {
					System.out.println("======="+i);
					break;
				}
			}
		}
	}

	public static BigInteger countWays(int n) {
		BigInteger temp = BigInteger.ZERO;
		for (int i = 2; i <= n; i++) {
			temp = temp.add(getSum(n, i));
		}
		return temp.add(BigInteger.ONE);
	}

	public static BigInteger getSum(int m, int n) {
		if (!countWays.containsKey(String.valueOf(m) + "," + String.valueOf(n))) {
			if (n > m) {
				return BigInteger.ZERO;
			}
			if (n == 2 && m == 2) {
				return BigInteger.ONE;
			}
			if (n == 1) {
				countWays.put(String.valueOf(m) + "," + String.valueOf(n),
						BigInteger.ONE);
				return BigInteger.ONE;
			}
			if(!countWays.containsKey(String.valueOf(m-1) + "," + String.valueOf(n-1))||!countWays.containsKey(String.valueOf(m-n) + "," + String.valueOf(n))){
				countWays.put(String.valueOf(m-1) + "," + String.valueOf(n-1),
						getSum(m-1,n-1));
				countWays.put(String.valueOf(m-n) + "," + String.valueOf(n),
						getSum(m-n,n));
				
			}
			countWays.put(String.valueOf(m) + "," + String.valueOf(n),
					countWays.get(String.valueOf(m-1) + "," + String.valueOf(n-1)).add(countWays.get(String.valueOf(m-n) + "," + String.valueOf(n))));
			return countWays.get(String.valueOf(m) + "," + String.valueOf(n));
		}else{
			return countWays.get(String.valueOf(m) + "," + String.valueOf(n));
		}
	}

}
