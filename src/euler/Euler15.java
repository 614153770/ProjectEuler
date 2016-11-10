package euler;

import java.math.BigInteger;

public class Euler15 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(getSum(20,20));
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	

	public static BigInteger getSum(int m,int n) {
		return get(m+n).divide((get(m).multiply(get(n))));
	}
	
	
	
	public static BigInteger get(int num) {
		BigInteger temp=BigInteger.ONE;
		for(int i=1;;i++){
			temp=temp.multiply(BigInteger.valueOf(num));
			num=num-1;
			if(num==1){
				break;
			}
			
		}
		return temp;
	}

}
