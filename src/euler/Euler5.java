package euler;

public class Euler5 {

	public static void main(String[] args) {
		findPositiveNumber(20);

	}
	
	
	public static void findPositiveNumber(int number) {
		int num=0;
		for(int i=2520;;i++){
			for(int j=2;j<20;j++){
				if(i%j!=0){
					break;
				}
				if(j==19){
					num=i;
					System.out.println(i);
					break;
				}
			}
			if(num!=0){
				break;
			}
			
			
		}
	}
	
	
}
