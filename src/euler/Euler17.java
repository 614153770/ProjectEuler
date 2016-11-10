package euler;

public class Euler17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	public static int countL(int n) {
		int count =0;
		if(n>=100){
			count+=10+countL(n/100)+countL(n%100);
		}else if(n>20){
			
		}else if(n>10){
			
		}
		return count;	
		}
}
