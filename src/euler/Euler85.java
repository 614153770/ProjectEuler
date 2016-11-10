package euler;

import java.util.HashMap;
import java.util.Map;

public class Euler85 {
	public static Map<String,Integer> countWays=new HashMap();
	
	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findNum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void findNum() {
		int min=10000000;
		int num=0;
		for(int i=1;i<2000;i++){
			for(int j=1;j<=i;j++){
				int temp=countNum(i,j)-2000000;
				int tempNum=temp>0?temp:-temp;
				if(tempNum<min){
					min=tempNum;
					num=i*j;
				}
				if(temp>0){
					break;
				}
			}
		}
		System.out.println(num);

	}
	
	
	public static int countNum(int m,int n) {
		if(m==1||n==1){
			int temp=m>n?m:n;
			if(!countWays.containsKey(String.valueOf(m)+","+String.valueOf(n))){
				countWays.put(String.valueOf(m)+","+String.valueOf(n), temp*(temp+1)/2);
			}
			return countWays.get(String.valueOf(m)+","+String.valueOf(n));
		}
		if(!countWays.containsKey(String.valueOf(m-1)+","+String.valueOf(n))){
			countWays.put(String.valueOf(m-1)+","+String.valueOf(n),countNum(m-1,n));
		}
		if(!countWays.containsKey(String.valueOf(m)+","+String.valueOf(n-1))){
			countWays.put(String.valueOf(m)+","+String.valueOf(n-1),countNum(m,n-1));
		}
		if(!countWays.containsKey(String.valueOf(m-1)+","+String.valueOf(n-1))){
			countWays.put(String.valueOf(m-1)+","+String.valueOf(n-1),countNum(m,n-1));
		}
		return m*n+countWays.get(String.valueOf(m-1)+","+String.valueOf(n))+countWays.get(String.valueOf(m)+","+String.valueOf(n-1))-countWays.get(String.valueOf(m-1)+","+String.valueOf(n-1));
	}

}
