package homework3;

import java.util.*;

public class homework3_2 {
	double m2_area;
	double pyung_area;
	String size = "";
	
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. ");
		
		this.m2_area = s.nextDouble();
		this.pyung_area = m2_area / 3.305;
		
		if(pyung_area >= 50) this.size += "대형";
		else if (pyung_area >= 30) this.size += "중형";
		else if (pyung_area >= 15) this.size += "중소형";
		else this.size += "소형";
		
		s.close();
		output();
	}
	void output(){
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", this.pyung_area);
		System.out.println(this.size + "아파트 입니다.");
	}
	public static void main(String[] args){
		new homework3_2().input();
	}
}