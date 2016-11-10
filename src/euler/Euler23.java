package euler;

import java.util.ArrayList;

public class Euler23 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findSum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}
	
	public static void findSum() {
		int sum=0;
		ArrayList temp=new ArrayList();
		for(int i=2;i<28124;i++){
			if(findSumP(i)>i){
				temp.add(i);
			}
		}
		for(int k=1;k<28124;k++){
			int flag=0;
			for(int j=1;j<k;j++){
				if(temp.contains(j)&&temp.contains(k-j)){
					flag+=1;
					break;
				}
				
			}
			
			if(flag==0){
				System.out.println(k);
				sum+=k;
			}
			
		}
		System.out.println(sum);
	}
	
	public static int findSumP(int num) {
		int count=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				count+=i;
			}
		}
		return count;

	}
	
}
