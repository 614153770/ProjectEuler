package euler;

import java.math.BigInteger;

public class Euler25 {

	public static void main(String[] args) {
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMinF();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static void findMinF() {
		BigInteger a=BigInteger.ONE;
		BigInteger b=BigInteger.ONE;
		for(int i=3;;i++){
			if(String.valueOf(a.add(b)).length()==1000){
				System.out.println(i);
				break;
			}else{
				BigInteger temp=a;
				a=b;
				b=temp.add(b);
			}
		}

	}
	
	
	

}
