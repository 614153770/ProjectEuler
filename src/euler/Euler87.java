package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Euler87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countNum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static void countNum() {
		ArrayList<Integer> primes=new ArrayList();
		Set nums=new HashSet();
		int count=0;
		for(int i=2;i<50000;i++){
			if(judgeP(i)){
				primes.add(i);
			}
		}
		int size=primes.size();
		for(int i=0;i<size;i++){
			int primei=primes.get(i);
			if(primei*primei>=50000000){
				break;
			}

			for(int j=0;j<size;j++){
				int primej=primes.get(j);
				if(primei*primei+primej*primej*primej>=50000000){
					break;
				}
				for(int k=0;k<size;k++){
					int primek=primes.get(k);
					int num=primei*primei+primej*primej*primej+primek*primek*primek*primek;
					if(num>=50000000){
						break;
					}else{
						nums.add(num);
						count+=1;
					}
				}
			}
		}
		System.out.println(nums.size());
		
		
		
		
		
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
