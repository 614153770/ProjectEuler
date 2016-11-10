package euler;

public class Euler30 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		int sum=0;
		for(int i=2;i<500000;i++){
			if(i==findSum(i)){
				sum+=i;
			}
		}
		System.out.println(sum);
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static int findSum(int i) {
		int count=0;
		if(i>=10){
				int n=i%10;
				count=count+n*n*n*n*n+findSum(i/10);
		}else{
			count+=i*i*i*i*i;
		}
		return count;
	}

}
