package euler;

import java.util.HashMap;

public class Euler14 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMax();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static void findMax() {
		long max=0;
		long start=0;
		HashMap<Long,Long> numCount=new HashMap();
		for(long i=5;i<1000000;i++){
			long count=0;
			for(long j=i;;){
				if(j!=1){
					if(numCount.containsKey(j)){
						count+=numCount.get(j);
						break;
					}
					if(j%2==0){
						j=j/2;
					}else{
						j=3*j+1;
					}
					count+=1;
				}else{
				break;
				}
			}
			numCount.put(i, count);
			if(count>max){
				max=count;
				start=i;
			}
			
		}
		System.out.println(start);
	}
	
	
	

}
