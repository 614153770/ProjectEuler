package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Euler138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		sumL();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	public static void sumL() {
		int count=0;
		int sum=0;
		Map<Integer,Integer> lengths=new HashMap();
		ArrayList<Integer> bh=new ArrayList();
		for(int i=3;;i=i+1){
			if(bh.size()>12){
				if(bh.get(11)<i/2-2){
					System.out.println(bh.get(11)+"   "+i);
					break;
				}
			}
			int temp=i*i+(i-1)*(i-1)/4;
			int temp1=i*i+(i+1)*(i+1)/4;
			int lengthL=(int) Math.pow(temp, 0.5);
			int lengthL1=(int) Math.pow(temp1, 0.5);
			if(lengthL*lengthL==temp){
				count+=1;
				lengths.put(i, lengthL);
				bh.add(i);
			}
			if(lengthL1*lengthL1==temp1){
				lengths.put(i, lengthL1);
				bh.add(i);
			}
			Collections.sort(bh);
		}
		System.out.println(bh);
		for(int i=0;i<12;i++){
			System.out.println("==="+lengths.get(bh.get(i)));
			sum+=lengths.get(bh.get(i));
		}
		
		
		System.out.println(sum);
	}

}
