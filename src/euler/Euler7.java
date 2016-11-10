package euler;

public class Euler7 {

	public static void main(String[] args) {
		findPrime();
	}
	
	public static int findPrime() {
		int num=1;
		for(int i=3;;i++){
			if(judgeP(i)){
				num+=1;
			}
			if(num==10001){
				System.out.println(i);
				num=i;
				break;
			}
		}
		
		
		return num;
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
