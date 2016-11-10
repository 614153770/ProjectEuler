package euler;

import java.math.BigInteger;

public class Euler20 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(getSum());
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}
	
	public static long getSum() {
		String str=String.valueOf(get(100));
		long count=0;
		for(int i=0;i<str.length();i++){
			count=count+Long.valueOf(str.substring(i, i+1));
		}
		return count;
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
