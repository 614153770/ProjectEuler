package euler;

public class Euler10 {

	public static void main(String[] args) {
		System.out.println(findSumP(2000000));
	}

	
	public static long findSumP(int number) {
		long sum=2;
		for(int i=3;i<number;i=i+2){
			if(judgeP(i)){
				sum+=i;
			}
		}
		return sum;
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
