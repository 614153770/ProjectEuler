package euler;

public class Euler19 {

	public static void main(String[] args) {
		countDay();
	}
	
	
	
	
	public static void countDay() {
		int countDay=0;
		int count=0;
		for(int year=1900;year<=2000;year++){
			for(int month=1;month<=12;month++){
				for(int day=1;;day++){
				countDay+=1;
				if(year>=1901&&day==1&&countDay%7==0){
					count+=1;
				}
				if(month==4||month==6||month==9||month==11){
					if(day==30){
						break;
					}
				}else if(month==2){
					if(year%4==0&&year%100!=0){
						if(day==29){
							break;
						}
					}else if(year%400==0){
						if(day==29){
							break;
						}
					}else{
						if(day==28){
							break;
						}
					}
				}else{
					if(day==31){
						break;
					}
				}
				}
			}
		}
		System.out.println(count);
	}

}
