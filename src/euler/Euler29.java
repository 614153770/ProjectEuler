package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Euler29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countSum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void countSum() {
		Set<BigInteger> nums=new HashSet();
		for(int i=2;i<=100;i++){
			for(int j=2;j<=100;j++){
				nums.add(getPower(i,j));
			}
		}
		System.out.println(nums.size());
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
