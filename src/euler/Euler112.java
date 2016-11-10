package euler;

public class Euler112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		countNum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	public static void countNum() {
		int count=0;
		for(int i=1;;i++){
			if(isJump(i)){
				count+=1;
			}
			if((double)count/(double)i>=0.99){
				System.out.println(i);
				break;
			}
		}
	}
	
	
	public static boolean isJump(int n) {
		String str=String.valueOf(n);
		if(str.length()<3){
			return false;
		}
		if(Integer.valueOf(str.substring(0, 1))<Integer.valueOf(str.substring(1, 2))){
		for(int i=1;i<str.length()-1;i++){
			if(Integer.valueOf(str.substring(i, i+1))>Integer.valueOf(str.substring(i+1, i+2))){
				return true;
			}
		}
		}else if(Integer.valueOf(str.substring(0, 1))>Integer.valueOf(str.substring(1, 2))){
			for(int i=1;i<str.length()-1;i++){
				if(Integer.valueOf(str.substring(i, i+1))<Integer.valueOf(str.substring(i+1, i+2))){
					return true;
				}
			}
		}else{
			return isJump(Integer.valueOf(str.substring(1, str.length())));
		}
		return false;

	}

}
