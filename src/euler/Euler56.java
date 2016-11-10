package euler;

import java.math.BigInteger;

public class Euler56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countSum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	public static void countSum() {
		BigInteger sum=BigInteger.ZERO;
		int max =0;
		for(int i=1;i<100;i++){
			for(int j=1;j<100;j++){
				int temp=getSum(getPower(i,j));
				if(temp>max){
					max=temp;
				}
			}
			
		}
		
		System.out.println(max);
	}
	
	public static BigInteger getPower(int m ,int n) {
		BigInteger temp=BigInteger.ONE ;
		if(n==1){
			return BigInteger.valueOf(m);
		}else{
			return BigInteger.valueOf(m).multiply(getPower(m,n-1));
		}

	}
	
	public static int getSum(BigInteger number) {
		String str=String.valueOf(number);
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum+=Integer.valueOf(str.substring(i, i+1));
		}
		return sum;

	}
	

}
