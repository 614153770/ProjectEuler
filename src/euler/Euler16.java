package euler;

import java.math.BigInteger;

public class Euler16 {
	
	
	
	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		get();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}

	public static void get() {
		String str=String.valueOf(findSum(2,1000));
		
		int count=0;
		for(int i=0;i<str.length();i++){
			count=count+Integer.valueOf(str.substring(i, i+1));
		}
		System.out.println(count);
	}
	
	
	public static BigInteger findSum(int n,int m) {
		BigInteger temp=BigInteger.ONE;
		for(int j=0;j<m;j++){
			temp=temp.multiply(BigInteger.valueOf(n));
			
		}
		return temp;
	}

}
