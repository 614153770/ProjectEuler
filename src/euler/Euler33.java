package euler;

import java.util.ArrayList;

public class Euler33 {

	public static void main(String[] args) {
		System.out.println((double)4/8);
		System.out.println(getR(49,98));
		getD();
	}
	
	
	
	public static void getD() {
		for(int i=10;i<100;i++){
			for(int j=i+1;j<100;j++){
				if(((double)i/j)==getR(i,j)){
					System.out.println(i+"   "+j);
				}
			}
		}

	}
	
	
	public static double getR(int a,int b) {
		String strA=String.valueOf(a);
		String[] strsA=new String[strA.length()];
		String strB=String.valueOf(b);
		String[] strsB=new String[strA.length()];
		for(int i=0;i<strA.length();i++){
			strsA[i]= strA.substring(i, i+1);
		}
		for(int i=0;i<strB.length();i++){
			strsB[i]= strB.substring(i, i+1);
		}
		if(a%10==0){
			return 0;
		}
		
		if(strsA[0].equals(strsB[0])){
			return (double)Integer.valueOf(strsA[1])/Integer.valueOf(strsB[1]);
		}
		if(strsA[1].equals(strsB[0])){
			return (double)Integer.valueOf(strsA[0])/Integer.valueOf(strsB[1]);
		}
		if(strsA[1].equals(strsB[1])){
			return (double)Integer.valueOf(strsA[0])/Integer.valueOf(strsB[0]);
		}
		if(strsA[0].equals(strsB[1])){
			return (double)Integer.valueOf(strsA[1])/Integer.valueOf(strsB[0]);
		}
		
		
		
		
		return 0;
	
	}

}
