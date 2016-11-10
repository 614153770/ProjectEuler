package euler;

public class Euler39 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMaxP();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	
	public static void findMaxP() {
		// TODO Auto-generated method stub
		int max=0;
		int temp=0;
		for(int i=3;i<1000;i++){
			int count=0;
			for(int j=1;j<i;j++){
				for(int k=1;k<=(i-j)/2;k++){
					if(j*j+k*k==(i-j-k)*(i-j-k)){
						count+=1;
					}
				}
			}
			if(count>max){
				max=count;
				temp=i;
			}
		}
		System.out.println(temp);
	}
	
}
