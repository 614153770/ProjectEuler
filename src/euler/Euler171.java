package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Euler171 {
	
	public static Map<BigInteger,Integer> counts=new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		getSumLast9();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");;
	}
	
	
	
	
	
	
	public static void getSumLast9() {
		BigInteger count=BigInteger.ZERO;
		BigInteger max=pow(10,20);
		int sum=0;
		ArrayList<Integer> nums=new ArrayList();
		for(int i=0;i<41;i++){
			nums.add(i*i);
		}
		for(BigInteger i=BigInteger.ZERO;i.compareTo(max)<0;i=i.add(BigInteger.ONE)){
			System.out.println(i);
			if(nums.contains(getSum(i))){
				count=count.add(i);
			}
			
		}
		String str=String.valueOf(count);
		str=str.substring(str.length()-9, str.length());
		for(int i=0;i<str.length();i++){
			sum+=Integer.valueOf(str.substring(i, i+1));
		}
		System.out.println(sum);
		
	}
	
	public static BigInteger pow(int m,int n) {
		if(n==1){
			return BigInteger.valueOf(m);
		}
		if(n==0){
			return BigInteger.ZERO ;
		}
		return BigInteger.valueOf(m).multiply(pow(m,n-1));
	}
	
	
	
	
	
	public static int getSum(BigInteger num) {
		int count=0;
		String str=String.valueOf(num);
		BigInteger lengthNum=pow(10,str.length());
		BigInteger temp=num.divide(lengthNum);
		if(!counts.containsKey(num.subtract(temp.multiply(lengthNum)))){
			for(int i=0;i<str.length();i++){
			int temp1=Integer.valueOf(str.substring(i, i+1));
			count=count+temp1*temp1;
			}
			counts.put(num, count);
		}else{
			String strFirstNum=String.valueOf(temp);
			int firstNum2=Integer.valueOf(strFirstNum)*Integer.valueOf(strFirstNum);
			counts.put(num, firstNum2+counts.get(num.subtract(temp.multiply(lengthNum))));
			return counts.get(num); 
		}
		return count;
	}

}
