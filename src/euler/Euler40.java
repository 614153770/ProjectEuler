package euler;

public class Euler40 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(getNumber(1)*getNumber(10)*getNumber(100)*getNumber(1000)*getNumber(10000)*getNumber(100000)*getNumber(1000000));
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	public static int getNumber(int n) {
		int count=0;
		int num=0;
		for(int i=1;count<n;i++){
			count+=String.valueOf(i).length();
			num=i;
		}
		String str=String.valueOf(num);
		count=count-n;
		return Integer.valueOf(str.substring(str.length()-count-1, str.length()-count));
	}

}
