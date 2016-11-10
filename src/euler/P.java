package euler;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
