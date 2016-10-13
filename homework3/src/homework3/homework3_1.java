package homework3;

import java.io.*;
import java.util.*;

public class homework3_1 {

	int num1, num2, num3, temp;
	int max_num, min_num;
	
	void input(){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Insert 1st Number : ");
		this.num1 = s.nextInt();
		System.out.print("Insert 2nd Number : ");
		this.num2 = s.nextInt();
		System.out.print("Insert 3rd Number : ");
		this.num3 = s.nextInt();
		
		this.max_num = num1;
		this.min_num = num1;
		
		if(num2 >= max_num) max_num = num2;
		if(num3 >= max_num) max_num = num3;
		if(num2 <= min_num) min_num = num2;
		if(num3 <= min_num) min_num = num3;
		
		output();
			
		}
	
	void output(){
		System.out.printf("Max num : %d\nMin num : %d\n", this.max_num, this.min_num);
	}
	
	public static void main(String[] args){
		new homework3_1().input();
	}
}
