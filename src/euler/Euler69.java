package euler;

import java.util.ArrayList;

public class Euler69 {
	public static ArrayList<Integer> primes=new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMax();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	
	
	
	public static void findMax() {
		for(int i=2;i<500000;i++){
			if(judgeP(i)){
				primes.add(i);
			}
		}
		double max=0;
		int num=0;
		for(int i=2;i<1000000;i=i+2){
			if(i%100000==0){
			System.out.println(max+"  "+i);
			}
			double count=0;
			for(int j=1;j<i;j++){
				if(judge(i,j)){
					count+=1;
				}
				double temp=((double)i)/count;
				if(temp<max){
					break;
				}
			}
			double temp=((double)i)/count;
			if(temp>max){
				max=temp;
				num=i;
			}
		}
		System.out.println(max+"  "+num);
	}
	
	
	public static boolean judge(int n,int m) {
		
		int tempMax=m>n?m:n;
		int tempMin=m>n?n:m;
		int temp=tempMax%tempMin;
		if(n==1||m==1){
			return true;
		}
		
		if(temp==0){
			return false;
		}
		n=m>n?n:m;
		return judge(temp,n);
	}
	
	
	public static boolean judgeP(int number) {
		if(number<2){
			return false;
		}
		if(number==2||number==3||number==5||number==7){
			return true;
		}
		if(number%2==0){
			return false;
		}
		for(int i=3;i*i<=number;i=i+2){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

}
