package euler;

public class Euler21 {

	public static void main(String[] args) {
		System.out.println(sumP(220));
		int sum=0;
		for(int i=1;i<10000;i++){
				int j=sumP(i);
				if(j!=i&&j<10000&&sumP(j)==i){
					sum=sum+i;
			}
		}
		//私以为应该除2
		//System.out.println(sum/2);
		System.out.println(sum);

	}

	
	
	public static int sumP(int num) {
		int count=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				count+=i;
			}
		}
		return count;
	}
}
