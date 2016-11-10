package euler;

public class Euler2 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("值不超过四百万的项，找出其中值为偶数的项的和为："+findSum());
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");

	}
	
	
	
	//考虑斐波纳契数列中不超过400万的项, 其中是偶数的项的和是多少.
	public static int findSum() {
		int sum=0;
		for(int i=1,j=2;i<4000000;){
				if(i%2==0){
					sum+=i;
				};
				int temp=i;
				i=j;
				j=temp+j;
		}
		return sum;
	}
	
	

}
