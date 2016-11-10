package euler;

public class Euler58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMin();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	public static void findMin() {
		int countAll=1;
		int count=0;
		for(int i=2;;i++){
			if(judgeP(4*i*i-10*i+7)){
				count+=1;
			}
			if(judgeP(4*i*i-6*i+3)){
				count+=1;
			}
			if(judgeP(4*i*i-8*i+5)){
				count+=1;
			}
			countAll+=4;
			if(10*count<countAll){
				int num=2*i-1;
				System.out.println(num);
				break;
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
