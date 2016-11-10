package euler;

import java.util.ArrayList;

public class Euler66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		findMin();
		long stopMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计：" + (stopMili - startMili) + "毫秒");
	}

	public static void findMin() {
		long min = 0;
		ArrayList<Integer> nums = new ArrayList();
		for (int i = 2; i < 33; i++) {
			nums.add(i * i);
		}
		for (int d = 10; d < 1000; d++) {
			if(nums.contains(d)){
				continue;
			}
			System.out.println(d+"   "+min);
			for (long x = 1;; x++) {
				
				int temp = (int) Math.pow((1+d*x*x) , 0.5);
				if (temp*temp- d * x * x==1 ) {
					if(temp > min){
						min = temp;
						}
					break;
					
				}
				if(x<0){
					System.out.println("wrong way");
				}
			}

		}
		System.out.println(min);
	}

}
