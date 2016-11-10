package euler;

public class Euler4 {

	public static void main(String[] args) {
		System.out.println(findLP());

	}

	public static int findLP() {
		int palindrome=0;
		for(int i=100;i<1000;i++){
			for(int j=100;j<1000;j++){
				if(judgeP(i*j)&&(i*j)>palindrome){
					palindrome=i*j;
				}
			}
			
		}
		
		return palindrome;
	}
	
	public static boolean judgeP(int number) {
		byte[] bytesNumber=String.valueOf(number).getBytes();
		for(int i=0;i<=bytesNumber.length/2;i++){
			if(bytesNumber[i]!=bytesNumber[bytesNumber.length-i-1]){
				return false;
			}
		}
		
		return true;
	}
	
	
}
