package euler;

import java.util.ArrayList;

public class Euler46 {

	public static void main(String[] args) {
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		long n =1000000;
		findMin();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static void findMin() {
		ArrayList<Integer> primeList=new ArrayList();
		for(int i=3;i<9999999;i=i+2){
			if(judgeP(i)){
				primeList.add(i);
			}
		}
		for(int i=3;;i=i+2){
			if(!judgeP(i)){
				int temp=0;
				for(int j=0;;j++){
					
					if(primeList.get(j)>=i){
						break;
					}else{
						if(Math.sqrt((double)((i-primeList.get(j))/2))%1==0){
							temp+=1;
						}
					}
				}
				if(temp==0){
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
