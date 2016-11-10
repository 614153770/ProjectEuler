package euler;

import java.math.BigInteger;

public class Euler94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumLength();
	}
	
	
	
	
	
	
	
	public static void sumLength() {
		BigInteger sumLength=BigInteger.ONE;
		for(int i=3;i<=1000000000/3;i=i+2){
			System.out.println(i);
			BigInteger temp=BigInteger.valueOf(i);
			BigInteger halfBottom1=BigInteger.valueOf(i-1).divide(BigInteger.valueOf(2));
			BigInteger halfBottom2=BigInteger.valueOf(i+1).divide(BigInteger.valueOf(2));
			BigInteger height1=new BigInteger(String.valueOf((int)Math.sqrt(Double.valueOf(String.valueOf(temp.multiply(temp).subtract(halfBottom1.multiply(halfBottom1)))))));
			BigInteger height2=new BigInteger(String.valueOf((int)Math.sqrt(Double.valueOf(String.valueOf(temp.multiply(temp).subtract(halfBottom2.multiply(halfBottom2)))))));
			if(height1.multiply(height1).compareTo(temp.multiply(temp).subtract(halfBottom1.multiply(halfBottom1)))==0){
				sumLength=sumLength.add(temp).add(temp).add(temp).subtract(BigInteger.ONE);
			}
			if(height2.multiply(height2).compareTo(temp.multiply(temp).subtract(halfBottom1.multiply(halfBottom2)))==0){
				sumLength=sumLength.add(temp).add(temp).add(temp).add(BigInteger.ONE);
			}
		}
		System.out.println(sumLength);
	}

}
