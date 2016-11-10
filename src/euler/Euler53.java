package euler;

import java.math.BigInteger;

public class Euler53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		getCount();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	
	
	public static void getCount() {
		int count=0;
		for(int i=22;i<=100;i++){
			for(int j=2;j<=i/2+1;j++){
				if(getSum(i,j).compareTo(BigInteger.valueOf(1000000))>0){
					count+=i-2*j+1;
					break;
				}
			}
		}
		System.out.println(count);
	}
	
	public static BigInteger getSum(int m,int n) {
		return get(m).divide((get(m-n).multiply(get(n))));
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
