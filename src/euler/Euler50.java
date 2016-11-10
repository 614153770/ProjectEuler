package euler;

import java.util.ArrayList;

public class Euler50 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		long n =1000000;
		findMin();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void findMin() {
		int max=0;
		int minPrime=0;
		ArrayList<Integer> primeList=getListPrime();
		for(int num=0;num<primeList.size();num++){
		for(int i=0;i<primeList.size();i++){
			int sum=0;
			for(int j=0;j<primeList.size()-i;j++){
				sum=sum+primeList.get(i+j);
				if(sum==primeList.get(num)&&j>max){
					max=j;
					minPrime=primeList.get(num);
					break;
				}else if(sum>primeList.get(num)){
					break;
				}

			}
		}
		}
		
		
		System.out.println(max+"   "+minPrime);
	}
	
	
	
	public static ArrayList<Integer> getListPrime() {
		ArrayList<Integer> primeList=new ArrayList();
		primeList.add(2);
		for(int i=3;i<1000000;i=i+2){
			if(judgeP(i)){
				primeList.add(i);
			}
		}
		return primeList;
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
