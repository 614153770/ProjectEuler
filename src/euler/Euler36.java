package euler;

public class Euler36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(sumPalindromic());
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	public static int sumPalindromic() {
		int sum=0;
		for(int i=0;i<1000000;i++){
			if(judgeP(String.valueOf(i))&&judgeP(Integer.toBinaryString(i))){
				sum+=i;
			}
		}
		return sum;
	}
	
	
	public static boolean judgeP(String str) {
		byte[] bytesNumber=str.getBytes();
		for(int i=0;i<=bytesNumber.length/2;i++){
			if(bytesNumber[i]!=bytesNumber[bytesNumber.length-i-1]){
				return false;
			}
		}
		
		return true;
	}

}
