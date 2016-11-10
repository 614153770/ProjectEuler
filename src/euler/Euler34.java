package euler;

import java.util.ArrayList;

public class Euler34 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(getR());
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}

	public static long getR() {
		long count = 0;
		for (long num = 10; num < 100000; num++) {
			String str = String.valueOf(num);
			long temp = 0;
			for (int i = 0; i < str.length(); i++) {
				temp = temp + (digits(Long.valueOf(str.substring(i, i + 1))));
			}
			if (temp == num) {
				count += temp;
			}
		}
		return count;
	}

	public static long digits(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * digits(n - 1);
		}

	}

}
