package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Euler42 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		countWord();
		long stopMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("程序运行共计：" + (stopMili - startMili) + "毫秒");
	}

	public static void countWord() {
		File words = new File("/Users/huang/test/p042_words.txt");
		int count = 0;
		ArrayList<String> namesList = new ArrayList();
		String[] wordsString = txt2String(words).split(",");
		ArrayList<Integer> triangleNumber=new ArrayList();
		for(int i=0;i<200;i++){
			triangleNumber.add(i*(i+1)/2);
		}
		for(int i = 0; i < wordsString.length; i++) {
			namesList.add((wordsString[i].split("\"")[1]));
		}
		for(int i = 0; i < namesList.size(); i++) {
			if(triangleNumber.contains(score(namesList.get(i)))){
				count+=1;
			}

		}
		System.out.println(count);

	}

	public static String txt2String(File file) {
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
				result.append(System.lineSeparator() + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	public static int score(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.substring(i, i + 1).hashCode() - 64;
		}
		return sum;
	}
}
