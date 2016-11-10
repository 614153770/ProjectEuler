package euler;

import java.math.BigInteger;

public class Euler55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countLychrel();
//		System.out.println(getSum(BigInteger.valueOf(18)));
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void countLychrel() {
		int count=0;
		for(int i=1;i<10000;i++){
			int temp=123;
			BigInteger tempBig=BigInteger.valueOf(i);
			for(int j=0;j<50;j++){
				tempBig=getSum(tempBig);
				
				if(judgeP(tempBig)){
					
					break;
				}
			}
			if(!judgeP(tempBig)){
				count+=1;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	public static BigInteger getSum(BigInteger n) {
		String str=String.valueOf(n);
		String strX="";
		for(int i=0;i<str.length();i++){
			strX+=str.substring(str.length()-i-1, str.length()-i);
		}
		BigInteger temp=new BigInteger(strX);
		return temp.add(n);
	}
	
	public static boolean judgeP(BigInteger num) {
		String str=String.valueOf(num);
		byte[] bytesNumber=str.getBytes();
		for(int i=0;i<=bytesNumber.length/2;i++){
			if(bytesNumber[i]!=bytesNumber[bytesNumber.length-i-1]){
				return false;
			}
		}
		
		return true;
	}
}
