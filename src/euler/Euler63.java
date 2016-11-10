package euler;

import java.math.BigInteger;

public class Euler63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countNum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void countNum() {
		int count=0;
		for(int i=1;i<10;i++){
			for(int j=1;j<100;j++){
				BigInteger temp=getXY(i,j);
				if(i==1000){
					System.out.println("test");
				}
				if(String.valueOf(temp).length()==j){
					count+=1;
				}else if(String.valueOf(temp).length()<j){
					break;
				}
			}
		}
		System.out.println(count);
	}
	
	public static BigInteger getXY(int x,int y) {
		BigInteger sum=BigInteger.ONE;
		for(int i=0;i<y;i++){
			sum=sum.multiply((BigInteger.valueOf((long)x)));
		}
		
		
		
		
		return sum;
	}
	
	

}
