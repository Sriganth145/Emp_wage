package bridgelabz;

import java.util.Random;

public class Emp_wage {

	public static void main(String[] args) {
		
		Random Input = new Random();
		
		int Wage_per_hour = 20;
		int Full_hour ;
		
		for(int i =0;i<20;i++) {
			
		int Ran = Input.nextInt(3);
		
		switch (Ran) {
		
		case 0 : Full_hour =0;
					System.out.println("Employee is absent");
					break;
					
					
		case 1 : Full_hour = 4;
					System.out.println("Employee is Part time");
					break;
					
		case 2 : 
				Full_hour = 8;
				System.out.println("Employee is Present");
				break;
			
		}
			int Emp_wage_perday = Full_hour*Wage_per_hour ;
			System.out.println(Emp_wage_perday);
			
			 Emp_wage_permonth = Emp_wage_perday + Emp_wage_permonth;
	}
			System.out.println(Emp_wage_permonth);
}
