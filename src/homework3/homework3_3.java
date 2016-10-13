package homework3;

import java.util.*;

public class homework3_3 {

	int month, day;
	int day_count;
		
	void input(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input Month : ");
		this.month = s.nextInt();
				
		switch(month){
		case 1:
			this.day_count += 0;
			break;
		case 2:
			this.day_count += 31;
			break;
		case 3:
			this.day_count += 59;
			break;
		case 4:
			this.day_count += 90;
			break;
		case 5:
			this.day_count += 120;
			break;
		case 6:
			this.day_count += 151;
			break;
		case 7:
			this.day_count += 181;
			break;
		case 8:
			this.day_count += 212;
			break;
		case 9:
			this.day_count += 243;
			break;
		case 10:
			this.day_count += 273;
			break;
		case 11:
			this.day_count += 304;
			break;
		case 12:
			this.day_count += 334;
			break;
		default:
			this.day_count = -1;
			break;
		}
		System.out.print("Input Day : ");
		day = s.nextInt();
		if(month <= 12){
			if(month == 1 || month == 3 || month ==5 || month == 7 || month == 8 || month == 10 || month == 12){
				if(day >= 1 && day <= 31) day_count += day;
				else day_count = -1;
			}
			else if(month == 2){
				if(day >= 1 && day <=28) day_count += day;
				else day_count = -1;
			}
			else{
				if(day >= 1 && day <= 28) day_count += day;
				else day_count = -1;
			}
		}
		
		output();
	}
	
	void output(){
		if(this.day_count != -1) System.out.println("Day of Year : " + day_count);
		else System.out.println("Wrong input");
	}
	
	public static void main(String[] args){
		new homework3_3().input();
	}
}
