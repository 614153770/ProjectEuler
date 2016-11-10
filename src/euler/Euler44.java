package euler;

import java.util.ArrayList;

public class Euler44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		findMinPentaPair();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	
	
	
	public static void findMinPentaPair() {
		int min;
		ArrayList<Integer> pentas=new ArrayList();
		for(int i=1;i<20000;i++){
			pentas.add(i*(3*i-1)/2);
		}
		System.out.println(pentas);
		for(int j=0;j<pentas.size();j++){
			for(int k=j+1;k<pentas.size();k++){
				if(pentas.contains(pentas.get(k)+pentas.get(j))&&pentas.contains(pentas.get(k)-pentas.get(j))){
						min=pentas.get(k)-pentas.get(j);
						System.out.println(pentas.get(k)+"    "+pentas.get(j)+ "   "+min);
				}
			}
		}
//		System.out.println(min);
	}

}
