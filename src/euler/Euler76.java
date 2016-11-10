package euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		countWays(100);
		long stopMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计：" + (stopMili - startMili) + "毫秒");
	}
	
	
	
	
	
	
	public static void countWays(int n) {
		BigInteger temp=BigInteger.ZERO;
		for(int i=2;i<=n;i++){
			temp=temp.add(getSum(n,i));
		}
		System.out.println(temp);

	}
	
	
	public static BigInteger getSum(int m,int n) {
		if(n>m){
			return BigInteger.ZERO;
		}
		if(n==2&&m==2){
			return BigInteger.ONE;
		}
		if(n==1){
			return BigInteger.ONE;
		}
		return getSum(m-1,n-1).add(getSum(m-n,n));
	}
	
	
	
	

}
