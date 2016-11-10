package euler;

import java.util.ArrayList;

public class Euler32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSum();
	}
	
	
	public static void getSum() {
		int sum=0;
		for(long i=2;i<999999999;){
			if(judgeN(i)>=0){
				i=i+(long)Math.pow(10, judgeN(i));
				break;
			}
			System.out.println(i);
			for(long j=100000000/i;j<=1000000000/i;){
				System.out.println(j);
				if(i>j){
					break;
				}
				if(judgeN(j)>=0){
					
					j=j+(long)Math.pow(10, judgeN(j));
					continue;
				}
				if(judgePan(i,j)){
					sum+=i*j;
					j++;
					continue;
				}
				j++;
			}
			i+=1;
			
		}
		System.out.println(sum);
	}
	
	
	
	
	public static boolean judgePan(long n,long m) {
		String str=String.valueOf(m)+String.valueOf(n)+String.valueOf(m*n);
		if(str.length()!=9){
			return false;
		}
		ArrayList<Long> pan=new ArrayList();
		for(int i=0;i<str.length();i++){
			pan.add(Long.valueOf(str.substring(i, i+1)));
		}
		for(int k=1;k<10;k++){
			if(!pan.contains(k)){
				return false;
			}
		}
		return true;
	}
	
	
	public static int judgeN(long n) {
		String str=String.valueOf(n);
		for(int i=str.length()-1;i>=0;i--){
			if(str.substring(i, i+1).equals("0")){
				return i-1;
			}
			for(int j=i+1;j<str.length();j++){
				if(str.substring(i, i+1)==str.substring(j, j+1)){
					return 0;
				}
			}
		}
		return -1;
	}
	


}
