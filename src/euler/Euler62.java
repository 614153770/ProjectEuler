package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Euler62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMinNum();
		long test=5027*5027*5027;
		long test1=8384*8384*8384;
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}
	
	
	
	public static void findMinNum() {
		Map<ArrayList<Integer>,Long> nums=new HashMap();
		Map<ArrayList<Integer>,BigInteger> numsMin=new HashMap();
		for(long i=0;;i++){
			BigInteger num=BigInteger.valueOf(i);
			ArrayList<Integer> temp=getNums(num.multiply(num).multiply(num));
			if(nums.containsKey(temp)){
				nums.put(temp, nums.get(temp)+1);
				if(nums.get(temp)==5){
					System.out.println(numsMin.get(temp));
					break;
				}
					
					
			}else{
				nums.put(temp, 1l);
				numsMin.put(temp, num.multiply(num).multiply(num));
			}
		}
	}
	
	
	
	
	
	
	public static ArrayList<Integer> getNums(BigInteger num) {
		ArrayList<Integer> temp=new ArrayList();
		String str=String.valueOf(num);
		for(int i=0;i<str.length();i++){
			temp.add(Integer.valueOf(str.substring(i, i+1)));
		}
		Collections.sort(temp);
		return temp;
	}

}
