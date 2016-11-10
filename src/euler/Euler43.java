package euler;

import java.util.ArrayList;

public class Euler43 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
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
