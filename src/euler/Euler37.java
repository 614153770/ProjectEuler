package euler;

public class Euler37 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(getAllPrime());
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	public static int getAllPrime() {
		int count=0;
		int sum=0;
		for(int i=10;;i++){
			if(isX(i)&&isY(i)){
				count+=1;
				sum+=i;
			}
			if(count==11){
				break;
			}
		}
		return sum;
		
	}
	
	
	public static boolean isX(int n) {
		for(int i=1;;){
			if(n>10){
				if(judgeP(n)){
					n=(int) (n%(Math.pow(10, (double)(int)Math.log10((double)n))));
				}else{
					return false;
				}
			}else{
				return  judgeP(n);
			}
		}
	}
	
	
	public static boolean isY(int n) {
		for(int i=1;;){
			if(n>10){
				if(judgeP(n)){
					n=(n-n%10)/10;
				}else{
					return false;
				}
			}else{
				return  judgeP(n);
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
