package euler;

public class Euler258 {

	public static void main(String[] args) {
		long num=(long) Math.pow(10, 18);
		System.out.print(gk(num)%20092010);

	}
	
	
	public static long gk(long num) {
		if(num>=0&&num<=1999){
			return 1;
		}else{
			return gk(num-2000)+gk(num-1999);
		}

	}

}
