package euler;

public class Euler31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countWays();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	public static void countWays() {
		int count=0;
		for(int i=0;i<=2;i++){
			for(int j=0;j<=(200-100*i)/50;j++){
				for(int k=0;k<=(200-100*i-50*j)/20;k++){
					for(int a=0;a<=(200-100*i-50*j-20*k)/10;a++){
						for(int b=0;b<=(200-100*i-50*j-20*k-10*a)/5;b++){
							for(int c=0;c<=(200-100*i-50*j-20*k-10*a-5*b)/2;c++){
									count+=1;
							}
						}
					}
				}
			}
		}
		//加上一个£2
		System.out.println(count+1);
	}

}
