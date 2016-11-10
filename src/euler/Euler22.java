package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Euler22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		scoreSum();
		long stopMili=System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计："+(stopMili-startMili)+"毫秒");
	}
	
	
	public static void scoreSum() {
		File nameFile=new File("/Users/huang/test/p022_names.txt");
		int count=0;
		ArrayList<String> namesList=new ArrayList();
		String[] names=txt2String(nameFile).split(",");
		for(int i=0;i<names.length;i++){
			namesList.add((names[i].split("\"")[1]));
		}
		Collections.sort(namesList);
		for(int i=0;i<namesList.size();i++){
			count=count+(i+1)*(score(namesList.get(i)));
			
		}
		System.out.println(count);

	}
	
	
	
	public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
	
	public static int score(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum+=str.substring(i, i+1).hashCode()-64;
		}
		return sum;
	}
	
	
}
