package euler;

import java.util.ArrayList;

public class Euler12 {

	public static void main(String[] args) {
		findNumber();
	}
	
	
	
	public static void findNumber() {
		int k=0;
		for(int i=1;;i++){
			k+=i;
			int count=0;
			for(int j=1;j<=k/2;j++){
				if(k%j==0){
					
					count+=1;
				}
			}
			if(count>=499){
				System.out.print(k);
				break;
			}
			}
			
		}
	
		
	
	
	
	
	
}
