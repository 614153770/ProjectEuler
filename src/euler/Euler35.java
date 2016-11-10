package euler;

import java.util.ArrayList;

public class Euler35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		getCount();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static void getCount() {
		int count=0;
		ArrayList primeList=new ArrayList();
		for(int i=2;i<1000;i++){
			if(judgeP(i)){
				primeList.add(i);
			}
		}
		for(int j=0;j<primeList.size();j++){
			int temp=(int) primeList.get(j);
			if(primeList.contains(getR(temp))){
				count+=1;
				System.out.println(temp);
			}
		}
		System.out.println(count);
		
		
		
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
	
	//得到数字的所有排列
	public static ArrayList getR(int num) {
		String str=String.valueOf(num);
		String[] strs=new String[str.length()];
		for(int i=0;i<str.length();i++){
			strs[i]= str.substring(i, i+1);
		}
		
		return null;
	}

}
