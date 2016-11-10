package euler;

import java.util.ArrayList;

public class Euler41 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		getMaxPan();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	public static void getMaxPan() {
		ArrayList<Integer> primes=new ArrayList();
		for(int i=7654321;i>1;i--){
			
			if(judgeP(i)){
				if(judgePan(i)){
				
				System.out.println(i);
				break;
				}
			}
		}
	}
	
	public static boolean judgeP(int number) {
		if(number<2){
			return false;
		}
		if(number==2||number==3||number==5||number==7){
			return true;
		}
		if(((number+1)%6!=0)&&((number-1)%6!=0)){
			return false;
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
	
	
	public static boolean judgePan(int n) {
		String str=String.valueOf(n);
		ArrayList<Integer> nums=new ArrayList();
		for(int i=0;i<str.length();i++){
			nums.add(Integer.valueOf(str.substring(i, i+1)));
		}
		if(nums.contains(0)){
			return false;
		}
		for(int i=1;i<str.length()+1;i++){
			if(!nums.contains(i)){
				return false;
			}
		}
		return true;
	}
}
