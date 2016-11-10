package euler;

import java.util.ArrayList;

public class Euler27 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findAB();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void findAB() {
		ArrayList temp=findP();
		int max=0;
		int ab=0;
		for(int a=-999;a<1000;a++){
			for(int b=-1000;b<=1000;b++){
				int count=0;
				for(int i=0;;i++){
					if(temp.contains(i*i+a*i+b)){
						count+=1;
					}else{
						break;
					}
				}
				if(count>max){
					max=count;
					ab=a*b;
				}
			}
		}
		System.out.println(ab);

	}
	
	
	
	
	
	public static ArrayList findP() {
		ArrayList temp=new ArrayList();
		for(int i=2;i<100000;i++){
			if(judgeP(i)){
				temp.add(i);
			}
		}
		return temp;

	}
	
	public static boolean judgeP(int number) {
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
