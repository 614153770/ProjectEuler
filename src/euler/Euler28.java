package euler;

public class Euler28 {

	public static void main(String[] args) {
		System.out.println(getSum(1001));

	}
	
	
	public static int getSum(int num) {
		num=(num+1)/2;
		return 1+sumA(num)+sumB(num)+sumC(num)+sumD(num);
	}
	
	public static int sumA(int num) {
		int sum =0;
		for(int i=2;i<=num;i++){
			sum+=((2*i-1)*(2*i-1));
		}
		return sum;
	}
	
	
	public static int sumB(int num) {
		int sum =0;
		for(int i=2;i<=num;i++){
			sum=sum+4*i*i-10*i+7;
		}
		return sum;
	}
	
	public static int sumC(int num) {
		int sum =0;
		for(int i=2;i<=num;i++){
			sum=sum+4*i*i-6*i+3;
		}
		return sum;
	}
	
	public static int sumD(int num) {
		int sum =0;
		for(int i=2;i<=num;i++){
			sum=sum+4*i*i-8*i+5;
		}
		return sum;
	}

}
