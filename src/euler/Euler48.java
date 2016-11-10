package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Euler48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countSum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	
	
	public static void countSum() {
		BigInteger sum=BigInteger.ZERO;
		int count=0;
		for(int i=1;i<=1000;i++){
				BigInteger temp=getPower(i,i);
				sum=sum.add(temp);
			
		}
		String str=String.valueOf(sum);
		str=str.substring(str.length()-10, str.length());
		System.out.println(str);
	}
	
	public static BigInteger getPower(int m ,int n) {
		BigInteger temp=BigInteger.ONE ;
		if(n==1){
			return BigInteger.valueOf(m);
		}else{
			return BigInteger.valueOf(m).multiply(getPower(m,n-1));
		}

	}
}
