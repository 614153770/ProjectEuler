package euler;

public class Euler9 {

	public static void main(String[] args) {
		findABC();
		System.out.print(200*375*425);
	}
	
	
	public static void findABC() {
		for(int a =1;a<500;a++){
			for(int b=a;b<500;b++){
				if(b*b+a*a==(1000-b-a)*(1000-b-a)){
					System.out.println("a:"+a+",b:"+b);
				}
			}
		}
	}

}
