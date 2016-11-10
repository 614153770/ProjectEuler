package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Euler125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		count();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	public static void count() {
		// TODO Auto-generated method stub
		int count=0;
		long sumAll=0;
		Set<Integer> nums=new HashSet();
		for(int i=1;i<10000;i++){
			int sum=i*i;
			for(int j=i+1;;j++){
				sum+=j*j;
				if(sum>100000000){
					break;
				}else if(judgeP(sum)){
					count+=1;
					nums.add(sum);
				}
			}
		}
		ArrayList<Integer> numsList=new ArrayList(nums);
		for(int i=0;i<numsList.size();i++){
			sumAll+=numsList.get(i);
		}
		System.out.println(sumAll);
	}
	
	
	
	
	public static boolean judgeP(int number) {
		byte[] bytesNumber=String.valueOf(number).getBytes();
		for(int i=0;i<=bytesNumber.length/2;i++){
			if(bytesNumber[i]!=bytesNumber[bytesNumber.length-i-1]){
				return false;
			}
		}
		
		return true;
	}

}
