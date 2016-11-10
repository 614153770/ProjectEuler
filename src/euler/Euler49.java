package euler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Euler49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		getString();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	public static void getString() {
		String str="";
		ArrayList<Integer> primes=new ArrayList();
		for(int i=1000;i<9999;i++){
			if(judgeP(i)){
				primes.add(i);
			}
		}
		for(int j=0;j<primes.size();j++){
			for(int k=j+1;k<primes.size();k++){
				int a=primes.get(j);
				int c=primes.get(k);
				int b=(c+a)/2;
				if(primes.contains(b)&&judgeD(a,b,c)){
					if(primes.get(j)!=1487){
						str=String.valueOf(primes.get(j))+String.valueOf((primes.get(k)+primes.get(j))/2)+String.valueOf(primes.get(k));
					}
				}

			}
		}
		System.out.println(str);
		
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
	
	
	public static boolean judgeD(int a,int b,int c) {
		String strA=String.valueOf(a);
		String strB=String.valueOf(b);
		String strC=String.valueOf(c);
		ArrayList<Integer> numsA=new ArrayList();
		ArrayList<Integer> numsB=new ArrayList();
		ArrayList<Integer> numsC=new ArrayList();
		for(int i=0;i<4;i++){
			numsA.add(Integer.valueOf(strA.substring(i, i+1)));
			numsB.add(Integer.valueOf(strB.substring(i, i+1)));
			numsC.add(Integer.valueOf(strC.substring(i, i+1)));
			
		}
		for(int i=0;i<4;i++){
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
		}
		
		return true;
		
		
		
	}
	
	
}
