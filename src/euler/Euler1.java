package euler;

public class Euler1 {

	public static void main(String[] args) {
	
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("小于1000的自然数中，所有3或5的倍数的和为"+findSum(1000));
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	//找出number以下的所有3或5的倍数的和
	public static int findSum(int number) {
		int sum =0;
		for(int i=3;i<number;i++){
			if( i%3==0 || i%5==0){
				sum+=i;
			}
		}
		return sum;
	}

}
