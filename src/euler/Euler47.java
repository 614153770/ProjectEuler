package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Euler47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMin();
	}
	
	
	
	
	
	public static void findMin() {
		for(long i=644;;i++){
			
			if(countFactors(i).size()==4){
				System.out.println(i);
				break;
			}
		}
	}
	
	
	public static Set<Long> countFactors(long number) {
		Set<Long> factors=new HashSet();
		for(long i=2;;i++){
			if(number%i==0){
				factors.add(i);
				number=number/i;
				if(judgeP(number)){
					factors.add(number);
					break;
				}
					
				i=2;
			}
		}
		number+=1;
		for(long i=2;;i++){
			if(number%i==0){
				factors.add(i);
				number=number/i;
				if(judgeP(number)){
					factors.add(number);
					break;
				}
					
				i=2;
			}
		}
		number+=1;
		for(long i=2;;i++){
			if(number%i==0){
				factors.add(i);
				number=number/i;
				if(judgeP(number)){
					factors.add(number);
					break;
				}
					
				i=2;
			}
		}
		number+=1;
		for(long i=2;;i++){
			if(number%i==0){
				factors.add(i);
				number=number/i;
				if(judgeP(number)){
					factors.add(number);
					break;
				}
					
				i=2;
			}
		}
		
		
		
		return factors;
	}
	
	
	
	public static boolean judgeP(long number) {
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
