package euler;

import java.util.ArrayList;
import java.util.List;

public class Euler45 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		long n =1000000;
		ArrayList<Long> tn=getT(n);
		ArrayList<Long> pn=getP(n);
//		System.out.prlongln(tn);
		for(int i=0;i<=tn.size();i++){
			if(tn.contains(pn.get(i))){
					if(pn.get(i)>40755){
					System.out.println(pn.get(i)+"  "+i);
					break;
					}
			}
		}
		
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}
	
	
	public static ArrayList<Long>  getT(long n){
		
		ArrayList<Long> tn=new ArrayList<Long>();
		for(long i=1;i<n;i++){
			tn.add(i*(2*i-1));
		}
		return tn;
	}
	
	public static ArrayList<Long>  getP(long n){
		
		ArrayList<Long> pn=new ArrayList<Long>();
		for(long i=1;i<n;i++){
			pn.add(i*(3*i-1)/2);
		}
		return pn;
	}
	
	

}
