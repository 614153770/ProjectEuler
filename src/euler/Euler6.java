package euler;

public class Euler6 {

	public static void main(String[] args) {
		System.out.println(getD(100));

	}
	
	public static long getD(int num) {
		int sumS=0;		//定义和的平方
		int squareS=0;	//定义平方的和
		for(int i=1;i<=num;i++){
			sumS+=i;
		}
		for(int i=1;i<=num;i++){
			squareS+=i*i;
		}
		
		
		
		return sumS*sumS-squareS;
	}

}
