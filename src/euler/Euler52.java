package euler;

import java.util.ArrayList;
import java.util.Collections;

public class Euler52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMinNumber();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	public static void findMinNumber() {
		for(int i=1;;i++){
			if(judgeD(i)){
				System.out.println(i);
				break;
				
			}
			if(i<0){
				break;
			}
		}
		
	}
	
	
	public static boolean judgeD(int num) {
		String strA=String.valueOf(num*2);
		String strB=String.valueOf(num*3);
		String strC=String.valueOf(num*4);
		String strD=String.valueOf(num*5);
		String strE=String.valueOf(num*6);
		ArrayList<Integer> numsA=new ArrayList();
		ArrayList<Integer> numsB=new ArrayList();
		ArrayList<Integer> numsC=new ArrayList();
		ArrayList<Integer> numsD=new ArrayList();
		ArrayList<Integer> numsE=new ArrayList();
		int length=strA.length();
		if(length!=strB.length()||length!=strC.length()||length!=strD.length()||length!=strE.length()){
			return false;
		}
		for(int i=0;i<length;i++){
			numsA.add(Integer.valueOf(strA.substring(i, i+1)));
			numsB.add(Integer.valueOf(strB.substring(i, i+1)));
			numsC.add(Integer.valueOf(strC.substring(i, i+1)));
			numsD.add(Integer.valueOf(strD.substring(i, i+1)));
			numsE.add(Integer.valueOf(strE.substring(i, i+1)));
			
		}
		for(int i=0;i<length;i++){
			if((!numsB.contains(numsA.get(i)))||(!numsC.contains(numsA.get(i)))||(!numsB.contains(numsC.get(i)))){
				return false;
			}
			if(Collections.frequency(numsA, numsA.get(i))!=Collections.frequency(numsB, numsA.get(i))){
				return false;
			}
			if(Collections.frequency(numsA, numsA.get(i))!=Collections.frequency(numsC, numsA.get(i))){
				return false;
			}
			if(Collections.frequency(numsC, numsB.get(i))!=Collections.frequency(numsB, numsB.get(i))){
				return false;
			}
			if((!numsD.contains(numsA.get(i)))||(!numsE.contains(numsA.get(i)))||(!numsB.contains(numsC.get(i)))){
				return false;
			}
			if(Collections.frequency(numsA, numsA.get(i))!=Collections.frequency(numsD, numsA.get(i))){
				return false;
			}
			if(Collections.frequency(numsA, numsA.get(i))!=Collections.frequency(numsE, numsA.get(i))){
				return false;
			}
			if(Collections.frequency(numsE, numsD.get(i))!=Collections.frequency(numsD, numsD.get(i))){
				return false;
			}
		}
		
		return true;
		
		
		
	}

}
