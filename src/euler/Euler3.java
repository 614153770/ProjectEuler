package euler;

public class Euler3 {

	public static void main(String[] args) {
		long startMili=System.currentTimeMillis();
		System.out.println("Euler3："+findFactor(600851475143l));
		long stopMili=System.currentTimeMillis();
		System.out.println("用时："+(stopMili-startMili)+"毫秒");

	}
	
	
	//找出给定number的质因数
	public static long findFactor(long number) {
		if(number%2==0){
			System.out.print(2+"*");
			return findFactor(number/2);
		}
		for(int i=3;i*i<=number;i=i+2){
			if(number%i==0){
				if(number==i){
				System.out.print(i);
				}
				return findFactor(number/i);
			}
		}
		return number;
	}
}
